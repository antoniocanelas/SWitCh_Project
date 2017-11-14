package httpmessage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class HTTP {

    public static final int CR = 13;
    public static final int LF = 10;
    public static final String CONTENT_TYPE = "Content-type";
    public static final String CONTENT_LENGTH = "Content-length";
    public static final String VERSION = "HTTP/1.1";
    public static final String CONNECTION = "Connection:";

    public static String readLine(DataInputStream in) throws IOException {

	String ret = "";
	int val;
	do {
	    val = in.read();
	    if (val != HTTP.CR) {
		ret = ret + (char) val;
	    }
	} while (val != HTTP.CR);
	in.read(); // read LF
	return ret;
    }

    public static void writeLine(DataOutputStream out, String line) throws IOException {

	out.write(line.getBytes(), 0, line.length());
	out.write(HTTP.CR);
	out.write(HTTP.LF);
    }

}
