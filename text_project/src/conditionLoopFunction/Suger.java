package conditionLoopFunction;

import java.util.Scanner;

public class Suger {

	public static void main(String[] args) {

		int n = 0; // �Է� ���� ���� ��
		int bongCnt = 0; // ��� �� ���� ��
		int num = 1; // ���� ��ȣ

		System.out.println("��� ������ ������ ���� 3~5000kg �Դϴ�.");

		while (num > 0) {
			System.out.println("���� �Է� " + num);

			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			bongCnt = n;

			if (n >= 3 && n <= 5000) {

				for (int x = 0; x < n; x++) {
					for (int y = 0; y < n; y++) {
						if ((3 * x + 5 * y) == n) {
							bongCnt = Math.min(bongCnt, (x + y));
						}
					}
				}
				System.out.println("���� ��� " + bongCnt);
				System.out.println(bongCnt);
				num++;

			} else {
				System.out.println("���� ��� " + bongCnt);
				System.out.println("-1");
				num = 0;
			} // if end

		} // while end
	} // main end

}
