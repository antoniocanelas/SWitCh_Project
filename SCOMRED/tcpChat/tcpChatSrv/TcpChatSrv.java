package tcpChatSrv;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpChatSrv {
	private static final int DEF_PORT = 8099;

	public static void main(String[] args) {
		ServerSocket sS;
		Socket cS;

		try {

			sS = new ServerSocket(DEF_PORT);
			while (true) {
				cS=sS.accept();
				Thread th=new Thread(new ThreadCliente(cS));
			}
			
		} catch (IOException e) {
			System.err.println("Erro fatal: "+e.getMessage());
			System.exit(1);
		}

	}

}