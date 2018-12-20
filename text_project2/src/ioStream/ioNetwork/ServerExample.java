package ioStream.ioNetwork;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ServerExample {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("192.168.18.246", 5001));
			

			while (true) {
				System.out.println("server waiting");
				Socket socket = serverSocket.accept();

				InputStream is = socket.getInputStream();
				byte[] bytes = new byte[1024];
				int readByteCount = is.read(bytes);
				String message = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("Input Data : " + message);

				OutputStream os = socket.getOutputStream();
				message = "¾È³ç";
				bytes = message.getBytes("UTF-8");

				os.write(bytes);
				os.flush();

				System.out.println("message Àü¼Û");

				is.close();
				socket.close();

			}

		} catch (IOException e) {
		}
		if (!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
			}
		}

	}

}
