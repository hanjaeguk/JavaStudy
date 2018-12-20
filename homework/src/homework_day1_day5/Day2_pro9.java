package homework_day1_day5;

public class Day2_pro9 {

	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수

		while (tmp != 0) {
			result = (result * 10) + tmp % 10;
			tmp = tmp / 10;
		}
		System.out.println(result);

//		for(int i =1; i<=5;i++) {
//			result = (result*10)+(tmp%10);
//			tmp = tmp/10;
//		}
//		System.out.println(result);

		if (number == result) {
			System.out.println(number + "는 회문수 입니다.");
		} else {
			System.out.println(number + "는 회문수가 아닙니다.");
		}
	}

}
