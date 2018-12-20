package conditionLoopFunction;

//import java.lang.Math;


public class Switch {
	public static void main(String[] arg) {
		int num = (int)(Math.random()*100); //0부터 99까지 (+1을 하면 1부터 100까지)
		System.out.println(num);
		
		int grade = 0;
		
		
		if(num >= 90) {
			grade = 1;
		}
		
		else if(num >= 80) {
			grade = 2;
		}
		
		else if(num >= 70) {
			grade = 3;
		}
		
		else if(num >= 60) {
			grade = 4;
		}
		

		
		switch(grade) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		case 4:
			System.out.println("D");
			break;

		default :
			System.out.println("F");
			break;	
			
		}
		
	}
}
