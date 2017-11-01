package webMultiplos;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebMultiplos {

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
				Thread th = new Thread(new HTTPclient(cs));
				th.start();
			} catch (IOException ioe) {
				System.out.println("Erro ao aceitar cliente:" + ioe.getMessage());

			}

		}
	}

}
