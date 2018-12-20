package ioStream.fileStream;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

public class FileExample {

	public static void main(String[] args) throws URISyntaxException {
		File dir = new File("c:/test");
		File dir2 = new File("c:/test2");
		
		File file1 = new File("c:/test/foo.txt");
		File file2 = new File(new URI("file:///c:/test/foo.txt"));
		
		System.out.println(dir.getName());
		System.out.println(file1.getName());
		System.out.println(file2.getName());
		
		if(dir2.exists() == false) {
			dir2.mkdir(); // ������ ���� ����
		}else {
			System.out.println("������ �����մϴ�.");
		}
		
//		dir2.delete();
		
	}

}
