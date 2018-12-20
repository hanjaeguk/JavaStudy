package ioStream.fileStream;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class FileExampleBook {

	public static void main(String[] args) throws URISyntaxException {
		File dir = new File("c:/Temp/Dir");
		File file1 = new File("c:/Temp/file1.txt");
		File file2 = new File("c:/Temp/file2.txt");
		File file3 = new File(new URI("file:///C:/Temp/file3.txt"));
		
		if(dir.exists() == false) {dir.mkdirs();}
		if(file1.exists() == false) {file1.mkdirs();}
		if(file2.exists() == false) {file2.mkdirs();}
		if(file3.exists() == false) {file3.mkdirs();}
		
		File temp = new File("C:/Temp");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  a  HH:mm");
		File[] contents = temp.listFiles();
		System.out.println("날짜                  시간           형태           크기                 이름");
		for(File file:contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t"+file.getName());
			}else {
				System.out.println("\t\t\t"+file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
		
	}

}
