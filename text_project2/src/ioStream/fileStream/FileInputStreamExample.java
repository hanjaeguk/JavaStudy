package ioStream.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args)  {
		String filePath = "c:/test";
		String fileName = "/a.txt";

		File file = new File(filePath + fileName);
		byte[] writeBytes = new byte[100];
		byte[] readBytes = new byte[100];
		
		writeBytes[0] = 65; //A
		writeBytes[1] = 66; //B
		writeBytes[2] = 67; //C
		writeBytes[3] = 68; //D
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(writeBytes,0,4);
			
			FileInputStream fis = new FileInputStream(file);
			fis.read(readBytes,0,4);
			for(int i = 0 ; i<4;i++) {
				System.out.println(readBytes[i]);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
