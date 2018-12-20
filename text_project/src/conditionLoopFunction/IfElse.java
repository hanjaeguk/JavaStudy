package conditionLoopFunction;

public class IfElse {
	public static void main(String[] args) {
		//a=70, b=65, c=4
		// 가장 큰수, 가장 작은수 출력
		
		int a = 70;
		int b = 65;
		int c = 4;
		int max = 0;
		int min = 0;
		
//		if ((a>b)&&(a>c)){
//			max = a;
//
//		}
//		else if((b>a)&&(b>c)) {
//			max = b;
//			
//		}
//		else if((c>a)&&(c>b)) {
//			max = c;
//
//		}
//
//		if ((a<b)&&(a<c)){
//			min = a;
//		}
//
//		else if((b<a)&&(b<c)) {
//			min = b;
//		}
//		else if((c<a)&&(c<b)) {
//			min = c;
//		}
//		
//		
		max = Math.max(Math.max(a,b), c);
		min = Math.min(Math.min(a,b), c);

		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		
	
	}
}
