package tcpChatSrv;

import java.io.DataOutputStream;
import java.util.*;

public class ListaClientes {// É um objecto único ->Nestes casos geralmente colocamos classe estática global

	private static HashMap<String, Cliente> lista = new HashMap<>();

	public static synchronized boolean adcionar(String nick,DataOutputStream o) {
		if (lista.containsKey(nick))
			return false;

		Cliente cli = new Cliente(o);
		lista.put(nick, cli);
		return true;

	}

	public static synchronized boolean remover(String nick) {
		// if (!lista.containsKey(nickname))return false;
		return (lista.remove(nick) != null);

	}

	public static synchronized void enviarParaTodos(Mensagem msg) {

		for (Cliente c: lista.values()){
			msg.enviar(c.daOutputStream());
		}
		
	}

}
