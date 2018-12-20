package exercise;

public class Day3_Ex_07 {

	public static void main(String[] args) {
		int max=0;
		int[] array = {1,5,3,8,2,5};
		
		
		for(int i=0;i<array.length-1;i++) {
			if(array[i] > max) {
				max=array[i];
			}
			
		}
		
		System.out.println("max:"+max);
	}

}
