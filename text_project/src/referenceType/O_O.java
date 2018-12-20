package referenceType;

public class O_O {
	public static void main(String[] args) {
		int[][] array2D = { { 1, 2, 3, 4, 5 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 15 }, 
				{ 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };

		int total = 0;
		int count = 0;

		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				total = total + array2D[i][j];
				count++;
			}		
		}
		
		int[][] arr = new int [5][6];
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if (j==5) {
					arr[i][j] = arr[i][0]+
								arr[i][1]+
								arr[i][2]+
								arr[i][3]+
								arr[i][4];
				}else {
				arr[i][j]=array2D[i][j];
				}
				
			}
		}
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr+" ");
			}
			System.out.println();
			}
		

	}

}
