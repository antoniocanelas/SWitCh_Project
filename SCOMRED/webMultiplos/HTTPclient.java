
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class HTTPclient extends Thread {

    private final Socket cliS;
    DataOutputStream out;
    DataInputStream in;

    private final String HTML_HEAD = "<html><head><title>WebMultiplos</title></head>"
	    + "<body bgcolor=c0c0c0><h1>WebMultiplos</h1>";
    private final String HTML_TAIL = "<hr><a href=/>Regressar ao formulario</a>" + "</body></html>"
	    + "<p><a href=/status>STATUS</A>" + "<p><a href=/close>CLOSE</A>";

    public HTTPclient(Socket s) {

	this.cliS = s;
    } // construtor guarda o socket

    @Override
    public void run() { // recebe um pedido do cliente e responde

	try {
	    this.out = new DataOutputStream(this.cliS.getOutputStream());
	    this.in = new DataInputStream(this.cliS.getInputStream());

	    String reqLine = readLineHTTP();
	    String headerLine;
	    System.out.println(reqLine);
	    do { // ler (e ignorar) as linhas de cabeçalho
		headerLine = readLineHTTP();
	    } while (!headerLine.isEmpty());

	    String[] reqComp = reqLine.split(" ");
	    if (!reqComp[0].contentEquals("GET")) {
		sendNotImplemented();
	    } else

	    if (reqComp[1].contentEquals("/")) {
		sendForm();
	    } else

	    if (reqComp[1].startsWith("/calcula")) {
		calcula(reqComp[1]);

	    } else

	    if (reqComp[1].contentEquals("/status")) {
		sendStatus();
	    } else

	    if (reqComp[1].contentEquals("/close")) {
		close();

	    } else {

		sendNotFound();
	    }

	} catch (IOException ioe) {
	    System.out.println("Erro de IO: " + ioe.getMessage());
	}
    }

    // uri = /calcula?A=valor1&B=valor2
    private void calcula(String uri) throws IOException {

	String[] args = uri.split("=");
	if (args.length != 3) {
	    sendInvalidData();
	}
	String valor2 = args[2];
	String valor1 = args[1].substring(0, args[1].length() - 2); // para tirar o &B
	int v1, v2;
	try {
	    v1 = Integer.parseInt(valor1);
	    v2 = Integer.parseInt(valor2);
	} catch (NumberFormatException ne) {
	    sendInvalidData();
	    return;
	}

	String content = this.HTML_HEAD;
	if (v1 > v2) { // trocar limites
	    int aux = v1;
	    v1 = v2;
	    v2 = aux;
	    content = content + "<p>Os limites do intervalo foram trocados</p>";
	}

	String[] multiplos = { "", "", "", "" };// 4 strings. em cada um dos
						// elementos armazenar os multimos.
						// inicialmente vazios e vao sendo
						// acrescentados
	int[] divisores = { 2, 3, 5, 7 };

	for (int v = v1; v <= v2; v++) { // percorre o intevalo dos numeros onde
					 // se quer ver se sao multiplos
	    for (int d = 0; d < 4; d++) {
		if (v % divisores[d] == 0) {
		    multiplos[d] = multiplos[d] + v + " ; ";
		}
	    }
	}
	content = content + "<h3>Múltiplos de 2, 3, 5 e 7 no intervalo [" + v1 + ", " + v2 + "]</h3><hr>";
	for (int d = 0; d < 4; d++) {
	    content = content + "<p><b>Múltiplos de " + divisores[d] + " : </b>" + multiplos[d] + "</p><hr>";
	}
	content = content + this.HTML_TAIL;
	sendHTMLcontent(content);
    }

    private final int CR = 13;
    private final int LF = 10;

    private String readLineHTTP() throws IOException {

	String ret = "";
	int val;
	do {
	    val = this.in.read();
	    if (val != this.CR) {
		ret = ret + (char) val;
	    }
	} while (val != this.CR);
	this.in.read(); // read LF
	return ret;
    }

    private void writeLineHTTP(String line) throws IOException {

	this.out.write(line.getBytes(), 0, line.length());
	this.out.write(this.CR);
	this.out.write(this.LF);
    }

    private void sendInvalidData() throws IOException {

	String content = this.HTML_HEAD + "<h2>Os dados fornecidos sao invalidos</h2>" + this.HTML_TAIL;
	sendHTMLcontent(content);
    }

    private void sendForm() throws IOException {

	String form = this.HTML_HEAD + "<h3>Calculo de múltiplos de 2, 3, 5 e 7 no intervalo [ A , B ]</h3>"
		+ "<form action=/calcula method=GET>" + "<p>A: <input type=text name=A value=1>"
		+ "<p>B: <input type=text name=B value=100>" + "<p><input type=submit value=CALCULAR>" + "</form>"
		+ this.HTML_TAIL;
	sendHTMLcontent(form);
    }

    private void sendStatus() throws IOException {

	String cont = this.HTML_HEAD + "<h2>Pedidos HTTP recebidos até ao momento: " + WebMultiplos.getContador()
		+ "</h2>" + "<h2>Endereço do cliente: " + this.cliS.getInetAddress().getHostName() + " : "
		+ this.cliS.getPort() + "</h2>" + this.HTML_TAIL;
	sendHTMLcontent(cont);
    }

    private void close() throws IOException {

	String cont = this.HTML_HEAD + "<h2>Aplicação terminada: </h2>" + "</body></html>";

	sendHTMLcontent(cont);
	System.exit(0);// Saida
    }

    private void sendHTMLcontent(String content) throws IOException {

	byte[] bCont = content.getBytes();
	writeLineHTTP("HTTP/1.0 200 OK"); // status line
	writeLineHTTP("Content-type: text/html; meta charset=UTF-8");
	writeLineHTTP("Content-length: " + bCont.length);
	writeLineHTTP("Connection: close");
	writeLineHTTP("");
	this.out.write(bCont, 0, bCont.length);
    }

    private void sendNotFound() throws IOException {

	String content = this.HTML_HEAD + "<h2>NOT FOUND</h2>" + this.HTML_TAIL;
	byte[] bCont = content.getBytes();
	writeLineHTTP("HTTP/1.0 404 Not Found");
	writeLineHTTP("Content-type: text/html; meta charset=UTF-8");
	writeLineHTTP("Content-length: " + bCont.length);
	writeLineHTTP("Connection: close");
	writeLineHTTP("");
	this.out.write(bCont, 0, bCont.length);
    }

    private void sendNotImplemented() throws IOException {

	String content = this.HTML_HEAD + "<h2>NOT IMPLEMENTED</h2>" + this.HTML_TAIL;
	byte[] bCont = content.getBytes();
	writeLineHTTP("HTTP/1.0 501 Not Implemented");
	writeLineHTTP("Content-type: text/html; meta charset=UTF-8");
	writeLineHTTP("Content-length: " + bCont.length);
	writeLineHTTP("Connection: close");
	writeLineHTTP("");
	this.out.write(bCont, 0, bCont.length);
    }
}
