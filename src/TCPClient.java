import java.net.*;
import java.io.*;

public class TCPClient {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("192.168.1.102", 6666);
		OutputStream os = s.getOutputStream();
		InputStream is = s.getInputStream();
		DataOutputStream dos = new DataOutputStream(os);
		DataInputStream dis = new DataInputStream(is);
		String readline = dis.readUTF();
		
		while(!readline.equals("bye")) {
			
			dos.writeUTF("hello Server,I am Lucas!");
			dos.flush();
			dos.close();
		}
	}
}
