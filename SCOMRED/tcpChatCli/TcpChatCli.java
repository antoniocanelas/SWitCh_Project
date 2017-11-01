package tcpChatCli;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;

import javax.xml.ws.RespectBinding;

import tcpChatSrv.Mensagem;

public class TcpChatCli {
	static final int DEF_PORT=8099;
	
	public static void main(String[] args) {
		String serverName,nickname;
		InetAddress serverIP;
		Socket ss;
		DataOutputStream outS;
		DataInputStream inS;
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			System.out.println("Endereço do servidor: ");
			serverName=in.readLine();
			serverIP=InetAddress.getByName(serverName);
			ss=new Socket(serverIP,DEF_PORT);
			outS = new DataOutputStream(ss.getOutputStream());
			inS = new DataInputStream(ss.getInputStream());
			Mensagem resp;
			do {
				System.out.println("Nickname: (vazio para desistir)");
				nickname=in.readLine();
				Mensagem m=new Mensagem(nickname);
				m.enviar(outS);
				resp=new Mensagem(inS);
				if(resp.estaVazia()) {
					ss.close();
					System.exit(0);//com código zero porque foi sem erro
					
				}
				if(resp.comoString().equals("KO")) {
					System.err.println("Nickname em uso...");
				}
				
				
			} while (!resp.comoString().equals("OK"));
			//Cliente registado
			System.out.println("Registado no servidor...");
			System.out.println("Pode escrever mensagem... (frase vazia para sair)");

			Thread th =new Thread(new ReaderThread(inS));
			th.start();
			Mensagem m;
			do {
				String frase=in.readLine();
				m=new Mensagem(frase);
				m.enviar(outS);
			} while (!m.estaVazia());
			try {
				th.join();
			} catch (InterruptedException ie) {
				
				System.err.println(ie.getMessage());
						
			}

		}
		
		catch (IOException e){
			System.err.println("Erro fatal: "+e.getMessage());
			System.exit(1);
			
		}

			}



}
