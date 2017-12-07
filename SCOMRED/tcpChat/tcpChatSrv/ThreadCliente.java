package tcpChatSrv;

import java.io.*;
import java.net.*;

public class ThreadCliente implements Runnable {
	private Socket cliSock;

	public ThreadCliente(Socket s) {
		cliSock = s;
	}

	public void run() {// Para iniciar o thread
		String nickname = "";
		try {
			DataOutputStream outS = new DataOutputStream(cliSock.getOutputStream());
			DataInputStream inS = new DataInputStream(cliSock.getInputStream());

			while (true) {
				Mensagem msg = new Mensagem(inS);
				if (msg.erro()) {
					cliSock.close();
					return;
				}

				if (msg.estaVazia()) {
					msg.enviar(outS);
					cliSock.close();
					return;
				}
				nickname = msg.comoString();
				if (ListaClientes.adcionar(nickname, outS))
					break; // Agora tenho de enviar ao cliente ou OK ou KO ->Mensagem()
				Mensagem ko = new Mensagem("KO");
				ko.enviar(outS);

			}
			Mensagem ok = new Mensagem("OK");
			ok.enviar(outS);

			// Cliente registado
			while (true) {
				Mensagem msg = new Mensagem(inS);
				if (msg.erro()) {
					ListaClientes.remover(nickname);
					cliSock.close();
					return;
				}

				if (msg.estaVazia()) {
					msg.enviar(outS);
					ListaClientes.remover(nickname);
					cliSock.close();
					return;
				}
				if (!msg.ecomando()) {
					Mensagem comNicknameMensagem=new Mensagem("["+nickname+"] "+msg.comoString());
					
					ListaClientes.enviarParaTodos(comNicknameMensagem);

				}

			}
		} catch (IOException e) {
			try {
				cliSock.close();
			} catch (IOException ex) {
			}
			return;
		}

	}

}
