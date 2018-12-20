package referenceType;

public class F_F {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4, 5 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 15 }, 
				{ 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };

		int total = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total = total + arr[i][j];
				count++;
			}		
		}
		
		int[][] avg = new int[4][4];
		for(int i=0;i<avg.length;i++) {
			for(int j = 0;j<avg[i].length;j++) {
				avg[i][j]=(arr[i][j]+arr[i][j+1]+arr[i+1][j]+arr[i+1][j+1]);
			}
		}
		
	
	}

}
