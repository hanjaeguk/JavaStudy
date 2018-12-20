package ioStream.ioNetwork;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientExample {

	public static void main(String[] args) {
		Socket socket = null;

		try {
			socket = new Socket();
			socket.connect(new InetSocketAddress("192.168.18.11", 5001));

			while (true) {
				OutputStream os = socket.getOutputStream();
				String message = "안녕";
				byte[] bytes = message.getBytes("UTF-8"); 
				

				
				os.write(bytes);
				
				InputStream is = socket.getInputStream();
				bytes = new byte[1024];
				int readByteCount = is.read(bytes);
				message = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("Input Data : " + message);
				
				os.flush();
				System.out.println("데이터전송완료");
				
				os.close();

			}

		} catch (IOException e) {
		}
		if(!socket.isClosed()) {
			try {
				socket.close();
			}catch(IOException e){}
		}
		
		
	}

}
