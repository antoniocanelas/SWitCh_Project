package httpmessage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class HTTPMessage {

    private boolean isRequest;
    private String method;
    private String uri;
    private String status;
    private boolean hasContent;

    private String contentType;
    private byte[] content;

    public HTTPMessage(DataInputStream in) throws IOException {

	hasContent = false;
	contentType = null;

	String firstLine = HTTP.readLine(in);
	isRequest = !firstLine.startsWith("HTTP");

	if (firstLine.startsWith("HTTP")) {
	    isRequest = false;
	}
	String[] firstLineComp = firstLine.split(" ");
	if (isRequest) {
	    method = firstLineComp[0];
	    uri = firstLineComp[1];
	} else {
	    status = firstLineComp[1] + " " + firstLineComp[2];
	}
	String headerLine;
	do {
	    headerLine = HTTP.readLine(in);
	    if (headerLine.toUpperCase().startsWith(HTTP.CONTENT_TYPE.toUpperCase())) {
		contentType = headerLine.substring(HTTP.CONTENT_TYPE.length()).trim();
	    } else if (headerLine.toUpperCase().startsWith(HTTP.CONTENT_LENGTH.toUpperCase())) {
		String cLen = headerLine.substring(HTTP.CONTENT_LENGTH.length()).trim();
		int len;
		try {
		    len = Integer.parseInt(cLen);

		} catch (NumberFormatException ne) {
		    throw new IOException();
		}
		content = new byte[len];
		if (len > 0) {
		    hasContent = true;
		}

	    }

	} while (!headerLine.isEmpty());

	// READ CONTENT
	if (hasContent) {
	    in.readFully(content, 0, content.length);
	}

    }

    public HTTPMessage() {

	isRequest = true;
	method = null;
	uri = null;
	hasContent = false;

    }

    public boolean sendMessage(DataOutputStream out) throws IOException {

	if (isRequest && (method == null || uri == null)) {
	    return false;
	}
	if (isRequest) {
	    HTTP.writeLine(out, method + " " + uri + " " + HTTP.VERSION);

	} else {
	    HTTP.writeLine(out, HTTP.VERSION + " " + status);
	}
	if (hasContent) {
	    HTTP.writeLine(out, HTTP.CONTENT_TYPE + " " + contentType);
	    HTTP.writeLine(out, HTTP.CONTENT_LENGTH + " " + contentType.length());

	}
	HTTP.writeLine(out, HTTP.CONNECTION + " close");
	HTTP.writeLine(out, "");

	if (hasContent) {
	    out.write(content, 0, content.length);
	}

	return true;

    }

}
