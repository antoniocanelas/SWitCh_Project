package udpCli;

import java.io.*;
import java.net.*;

public class UdpCliCast {

	static InetAddress IPdestino;
	static final int SERVER_PORT = 9999;
	static final String BCAST_ADRESS = "255.255.255.255";

	public static void main(String[] args) throws IOException {

		byte[] data = new byte[300];
		String frase = null;
		InetAddress meuServidor = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			IPdestino = InetAddress.getByName(BCAST_ADRESS);
		} catch (UnknownHostException ex) {
			System.out.println("O endereço/nome não é válido: " + frase);
			System.exit(1);
		}

		DatagramSocket sock = new DatagramSocket();
		sock.setBroadcast(true);
		DatagramPacket udpPacket = new DatagramPacket(data, data.length, IPdestino, SERVER_PORT);

		sock.setSoTimeout(2000);

		while (true) {
			System.out.print("Frase a enviar (para terminar utilize sair): ");
			frase = in.readLine();
			if (frase.compareTo("sair") == 0)
				break;
			udpPacket.setData(frase.getBytes());
			udpPacket.setLength(frase.length());
			sock.send(udpPacket);
			udpPacket.setData(data);
			udpPacket.setLength(data.length);
			do {
				sock.receive(udpPacket);
				if (meuServidor == null)
					meuServidor = udpPacket.getAddress();
			}

			while (udpPacket.getAddress() != meuServidor);

			try {
				sock.receive(udpPacket);
				frase = new String(udpPacket.getData(), 0, udpPacket.getLength());
				System.out.println("Resposta recebida do servidor: " + frase);
			} catch (SocketTimeoutException e) {
				System.out.println("O servifor nao respondeu");
			}
		}
		sock.close();
	}

}
