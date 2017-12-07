package tcpChatCli;

import java.io.DataInputStream;

import tcpChatSrv.Mensagem;

public class ReaderThread extends Thread{
	private DataInputStream inS;
	
	public ReaderThread(DataInputStream i) {
		inS=i;
	}

	@Override
	public void run() {
		Mensagem m;
		do {
			m=new Mensagem(inS);
			System.out.println(m.comoString());
			
		} while (!m.estaVazia());// ver**********************
	}
	
}
