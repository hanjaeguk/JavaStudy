package conditionLoopFunction;

public class Permutation {

	public static void main(String[] args) {

		int num = 3;
		int count = 0;
		for (int i = 1; i < num + 1; i++) {
			for (int j = 1; j < num + 1; j++) {
				if (i != j) {
					count++;
					System.out.println(i + "," + j);
				}
			}
		}
	}

}
