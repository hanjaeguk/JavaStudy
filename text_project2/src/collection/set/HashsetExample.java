package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String[] args) {
		HashSet<String> hashset = new HashSet<>();

		hashset.add("a");
		hashset.add("b");
		hashset.add("c");
		hashset.add("c"); // 같은 값이 2개이상 못들어감.

		Iterator<String> iterator = hashset.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(hashset.size());
		
		
	}

}
