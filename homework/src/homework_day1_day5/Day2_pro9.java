package homework_day1_day5;

public class Day2_pro9 {

	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		int result = 0; // ���� number�� �Ųٷ� ��ȯ�ؼ� ���� ����

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
			System.out.println(number + "�� ȸ���� �Դϴ�.");
		} else {
			System.out.println(number + "�� ȸ������ �ƴմϴ�.");
		}
	}

}
