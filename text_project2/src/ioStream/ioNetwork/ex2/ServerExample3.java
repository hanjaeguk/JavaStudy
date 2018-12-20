package ioStream.ioNetwork.ex2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample3 {
//	static ServerSocket serverSocket = null;
//	static Socket socket = null;

//	static byte[] sendBytes = new byte[100];
//	static byte[] receiveBytes = new byte[100];
//	static String sendMessage = null;
//	static String receiveMessage = null;
//	static int readByteCount = 0;
//	static InputStream is; 
//	static OutputStream os;

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;

		byte[] sendBytes = new byte[100];
		byte[] receiveBytes = new byte[100];
		String sendMessage = null;
		String receiveMessage = null;
		int readByteCount = 0;
		InputStream is;
		OutputStream os;
		String filePath = "C:/Enrol Server/Server.txt";
		File file = new File(filePath);

		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));// IP Port
			System.out.println("������");
			socket = serverSocket.accept();
			System.out.println("�������");
			checkIP(socket);

			is = socket.getInputStream();
			os = socket.getOutputStream();

			while (true) {
				// receive message
				if (is.available() != 0) {
					readByteCount = is.read(receiveBytes);
					receiveMessage = new String(receiveBytes, 0, readByteCount, "UTF-8");
					
					FileWriter fw = new FileWriter(file,true);
					fw.write(receiveMessage);
					fw.flush();
					System.out.println("Server Message: " + receiveMessage);
					
					System.out.println("Client Message: " + receiveMessage);
				}

				// send message
				if (System.in.available() != 0) {
					int length = System.in.read(sendBytes);

					if (length != -1 && length != 0) {
						sendMessage = new String(sendBytes, 0, length);
						os.write(sendMessage.getBytes("UTF-8"));
						os.flush();
						System.out.println("message ����");
					}
				}
			}
//			 is.close();
//			 os.close();
//			 socket.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		if (!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}

	private static void checkIP(Socket socket) {
		InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
		System.out.println(isa.getHostName());
		System.out.println(isa.getPort());
		System.out.println(isa.toString());
	}
}
