package tcpChatSrv;

import java.io.DataOutputStream;

public class Cliente {
	private DataOutputStream outS;

	public Cliente(DataOutputStream o) {
		outS = o;
	}
		
	public DataOutputStream daOutputStream() {
		return (outS);
	}
}
