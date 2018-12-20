package ioStream.fileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileEx {

	public static void main(String[] args)  {
		String filecopy = "C:/start/start.txt";
		String targetfile = "C:/end/start.txt";
		
		FileInputStream fis;
		try {
			int readByteNo;
			byte[] readBytes = new byte[100];
			fis = new FileInputStream(filecopy);
			FileOutputStream fos = new FileOutputStream(targetfile);
			while((readByteNo = fis.read(readBytes)) != -1) {
				fos.write(readBytes,0,readByteNo);
			}
			
			fos.flush();
			fos.close();
			fis.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
