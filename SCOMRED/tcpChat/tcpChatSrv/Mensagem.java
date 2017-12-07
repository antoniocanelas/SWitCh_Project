package tcpChatSrv;

import java.io.*;
public class Mensagem {
	private int len;
	private byte[] content;
	
	/**
	 * Construtor da classe que cria um objecto Mensagem através da leitura da mesma a partir de um DataInmputStream
	 * @param inS - É o DataInputStream do qual a mensagem vai ser lida
	 */
	public Mensagem(DataInputStream inS) {//Como é um construtor e só pode devolver um objecto tenho de tratar as excepções
		try {
			len = inS.read();
			content=new byte[len];
			inS.read(content,0,len);
		}
		catch (IOException e) {
			len=-1;//assinala erro IO
		}
		
		
	}
	public boolean erro() {return (len==-1);} //o mesmo que por "if(len==-1) return true"
	
	public boolean enviar(DataOutputStream outS) {
		if (len<0||len>255) return false;
		try {
			outS.write(len);
			outS.write(content,0,len);
		}
		catch(IOException e) {
			return false;
		}
		
		return true;
		
	}
	
	public Mensagem(String s) {
		len=s.length();
		content = s.getBytes();
	}
	
	
	public boolean estaVazia() {return (len==0);}
	public String comoString() {
		String s= new String(content,0, len);
		return s;
	}
	
	
	public boolean ecomando() {
		if(len<1)return false;
//		if(this.comoString().startsWith(".")) return (true);
		if(content[0]=='.') return true;
		return false;
		
	
	
	
	}
}
