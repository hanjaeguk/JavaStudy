package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A","B","C","D"); // 삭제 불가
		
//		ArrayList<String> list = new ArrayList<String>();
		// A B C D
//		list.add("A");
//		list.add("B");
//		list.add("C");
//		list.add("D");

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}

		System.out.println();
		System.out.println("------");

		list.remove(0);
		System.out.println(list.get(0));

		System.out.println("------");

		list.remove("C");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
		System.out.println("------");
		
		System.out.println(list.indexOf("B"));
		
		System.out.println("------");
		
		list.set(0,"F");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
		System.out.println("------");
		
	}

}
