package map;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTableExample {

	public static void main(String[] args) {
		Hashtable<String, String> hashTable = new Hashtable<>();
		hashTable.put("hong", "1234");
		hashTable.put("gil", "4321");
		hashTable.put("dong", "12");
		
		String pw = hashTable.get("hong");

		System.out.print("id: ");
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		

		if (hashTable.containsKey(id)) {
			System.out.print("pw: ");
			pw = sc.nextLine();
			if (hashTable.get(id).equals(pw)) {
				System.out.println("인증되었습니다.");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("ID가 없습니다.");
		}
	}

}
