package homework_day1_day5;

public class Day3_pro5 {

	public static void main(String[] args) {
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];

		for (int i = 0; i < ballArr.length; i++) {
			int j = (int) (Math.random() * ballArr.length);
			int tmp = 0;

			// �ڵ� �ۼ�
			tmp = ballArr[0];
			ballArr[0] = ballArr[j];
			ballArr[j] = tmp;
		}
		// �տ��� 3���� �� �迭 ball3�� ����
		ball3[0] = ballArr[0];
		ball3[1] = ballArr[1];
		ball3[2] = ballArr[2];

		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);
		}
	}
}
