package exercise;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count;
		System.out.print("반복 횟수를 입력하세요 : ");
		count = sc.nextInt();
		int N2 = 0;
		int N3 = 0;
		int N5 = 0;

		for (int i = 1; i <= count; i++) {
			String two = "";
			String three = "";
			String five = "";
			if (i % 2 == 0) {
				two = "2의배수 ";
				N2++;
			}
			if (i % 3 == 0) {
				three = "3의배수 ";
				N3++;
			}
			if (i % 5 == 0) {
				five = "5의배수 ";
				N5++;
			}
			System.out.println(i + "." + two + three + five);
		}
		System.out.println("====촐력 횟수====");
		System.out.println("2의 배수:" + N2);
		System.out.println("3의 배수:" + N3);
		System.out.println("5의 배수:" + N5);

	}

}
