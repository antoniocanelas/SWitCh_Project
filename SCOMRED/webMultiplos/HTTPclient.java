package webMultiplos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class HTTPclient extends Thread {
	private Socket cliS;
	DataOutputStream out;
	DataInputStream in;

	public HTTPclient(Socket s) {
		cliS = s;

	}

	@Override
	public void run() {
		try {
			out = new DataOutputStream(cliS.getOutputStream());
			in = new DataInputStream(cliS.getInputStream());

			String headerLine;
			String reqLine = readLineHTTP();

			do {
				headerLine = readLineHTTP();
			} while (!headerLine.isEmpty());

			String[] reqComp = reqLine.split(" ");
			if (!reqComp[0].contentEquals("GET"))
				return;

			if (reqComp[1].contentEquals("/"))
				sendForm();

		} catch (IOException ioe) {
			System.out.println("Erro de IO: " + ioe.getMessage());
			return;

		}

	}

	private final int CR = 13;
	private final int LF = 10;

	private String readLineHTTP() throws IOException {
		String ret = "";
		int val;
		do {
			val = in.read();
			if (val != CR)
				ret = ret + (char) val;
		} while (val != CR);

		in.read();
		return ret;

	}

	private void writeLineHTTP(String line) throws IOException {
		out.write(line.getBytes(), 0, line.length());
		out.write(CR);
		out.write(LF);

	}

	private void sendForm() throws IOException {
		String form = "<html><head><title>WebMultiplos</title></head>";
		form = form + "<body bgcolor=c0c0c0><h1>WebMultiplos</h1>";
		form = form + "<h3>Calculo de Múltiplos de 2,3,5 e 7 no intervalo [A, B ]</h3>";
		form = form + "<form action=/calcula method=GET>";
		form = form + "A: <input type=text name=A value=1>";
		form = form + "B: <input type=text name=B value=100>";
		form = form + "<input type=submit value=CALCULAR>";
		form = form + "</form></body></html>";
		sendHTMLContent(form);

	}

	private void sendHTMLContent(String content) throws IOException {
		byte[] bCont = content.getBytes();
		writeLineHTTP("HTTP/1.0 200 OK"); // status line
		writeLineHTTP("Content-type: text/html; charset=UTF8");
		writeLineHTTP("Content-length: " + bCont.length);
		writeLineHTTP("Connection: close");
		writeLineHTTP("");
		out.write(bCont, 0, bCont.length);

	}

}
