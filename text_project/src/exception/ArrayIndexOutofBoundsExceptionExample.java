package exception;

public class ArrayIndexOutofBoundsExceptionExample {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5}; 
	
		for (int i =0;i>array.length+1;i++) {
			System.out.println(array[i]);
		}
	}

}
