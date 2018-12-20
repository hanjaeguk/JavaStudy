package conditionLoopFunction;

import java.util.Scanner;

public class Suger {

	public static void main(String[] args) {

		int n = 0; // 입력 받을 설탕 양
		int bongCnt = 0; // 배달 할 봉지 수
		int num = 1; // 예제 번호

		System.out.println("배달 가능한 설탕의 양은 3~5000kg 입니다.");

		while (num > 0) {
			System.out.println("예제 입력 " + num);

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
				System.out.println("예제 출력 " + bongCnt);
				System.out.println(bongCnt);
				num++;

			} else {
				System.out.println("예제 출력 " + bongCnt);
				System.out.println("-1");
				num = 0;
			} // if end

		} // while end
	} // main end

}
