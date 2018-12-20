package conditionLoopFunction;

public class For_Ex2 {
	public static void main(String[] args) {
		
		// 1  3  5  7  9
		
		for(int i=1; i<=9;i+=2) {
			System.out.print(i+" ");	
		}
			System.out.println();
			
		//1  3  9  27  81
		int j = 1;
		for(int i = 0; i < 5; i++) {
			System.out.print(j+" ");
			j= j*3;
		}
			System.out.println();
			
		// 1  2  3  5  8
		
		int a = 1, b = 2;
		int c;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for (int i=0;i<3;i++) {
			c= a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

		
	}
}
