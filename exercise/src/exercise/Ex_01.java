package exercise;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count;
		System.out.print("�ݺ� Ƚ���� �Է��ϼ��� : ");
		count = sc.nextInt();
		int N2 = 0;
		int N3 = 0;
		int N5 = 0;

		for (int i = 1; i <= count; i++) {
			String two = "";
			String three = "";
			String five = "";
			if (i % 2 == 0) {
				two = "2�ǹ�� ";
				N2++;
			}
			if (i % 3 == 0) {
				three = "3�ǹ�� ";
				N3++;
			}
			if (i % 5 == 0) {
				five = "5�ǹ�� ";
				N5++;
			}
			System.out.println(i + "." + two + three + five);
		}
		System.out.println("====�ͷ� Ƚ��====");
		System.out.println("2�� ���:" + N2);
		System.out.println("3�� ���:" + N3);
		System.out.println("5�� ���:" + N5);

	}

}
