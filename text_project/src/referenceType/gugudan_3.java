package referenceType;

public class gugudan_3 {
	public static void main(String[] args) {
		int[][] gugudan = new int[9][3]; // [행][열]
		for (int i = 0; i < gugudan.length; i++) { // 9번 돌림
			gugudan[i][0] = 3;
			gugudan[i][1] = i + 1;
			gugudan[i][2] = gugudan[i][0] * gugudan[i][1];
		}

//		for (int i = 0; i < gugudan.length; i++) {
//			for (int j = 0; j < gugudan[i].length; j++) {
//				System.out.print(gugudan[i][j]+" ");
//
//			}
//			System.out.println();
//		}
		
		for(int[] array : gugudan) {
			for(int arr:array) {
				System.out.print(arr+" ");
			}
			System.out.println();
		}

	}

}
