package httpmessage;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebMultiplos {

    private static int contador = 0;

    public static synchronized int getContador() {

	return contador;
    }

    public static synchronized void incContador() {

	contador++;
    }

    public static void main(String[] args) {

	ServerSocket ss = null;
	try {
	    ss = new ServerSocket(8080);

	} catch (IOException ioe) {
	    System.out.println("Erro ao abrir o ServerSocket:" + ioe.getMessage());
	    System.exit(1);

	}

	while (true) {
	    try {
		Socket cs = ss.accept();
		incContador();
		Thread th = new Thread(new HTTPclient(cs));
		th.start();
	    } catch (IOException ioe) {
		System.out.println("Erro ao aceitar cliente:" + ioe.getMessage());

	    }

	}
    }

}
