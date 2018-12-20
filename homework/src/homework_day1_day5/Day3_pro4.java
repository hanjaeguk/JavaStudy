package homework_day1_day5;

public class Day3_pro4 {

	public static void main(String[] args) {
		int[][] score = { 
				{ 100, 100, 100 }, 
				{ 20, 20, 20 }, 
				{ 30, 30, 30 }, 
				{ 40, 40, 40 }, 
				{ 50, 50, 50 } 
				};
		int[][] result = new int[score.length + 1][score[0].length + 1];

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				result[i][j] = score[i][j];
				result[i][score[i].length] += score[i][j]; //score[i][0]+score[i][1]+score[i][2];
				result[score.length][j] += score[i][j]; //score[0][j]+score[1][j]+score[2][j]+score[3][j]+score[4][j];
				result[score.length][score[i].length] += score[i][j];//result[score.length][0]+result[score.length][1]+result[score.length][2];//???
			} // ¾È for
		} // ¹Û for

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}

	} // mian

}
