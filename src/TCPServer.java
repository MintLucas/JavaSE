import java.net.*;
import java.io.*;

public class TCPServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(6666);
		while(true) {
			Socket s = ss.accept();
			OutputStream os = s.getOutputStream();
			InputStream is = s.getInputStream();
			DataOutputStream dos = new DataOutputStream(os);
			DataInputStream dis = new DataInputStream(is);
			
			System.out.println("A client connected");
			dos.writeUTF("bye");

			System.out.println(dis.readUTF());
			dis.close();
			s.close();
		}
		
	}
}
