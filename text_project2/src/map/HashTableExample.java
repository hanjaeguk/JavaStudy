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
				System.out.println("�����Ǿ����ϴ�.");
			} else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		} else {
			System.out.println("ID�� �����ϴ�.");
		}
	}

}
