package homework_day1_day5;

public class Day2_pro3 {

	public static void main(String[] args) {
		int result = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				result = j + result;
			}
		}
		System.out.println(result);
	}

}
