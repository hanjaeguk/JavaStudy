package conditionLoopFunction;

import java.util.Scanner;

public class While_Ex2 {
	public static void main(String[] args) throws Exception{
		boolean run = true;
		int keyCode = 0;
		int speed = 0;

		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("--------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("--------------------");
				System.out.println("선택");
			}
			
//			keyCode = System.in.read(); // 유니코드로 숫자가 바뀜. Scanner은 받은 값 그대로
			Scanner sc = new Scanner(System.in);
			keyCode = sc.nextInt();
			System.out.println(keyCode);
			
			
			if(keyCode == 1) {  // 1을 잃었을 경우
				speed++;
				System.out.println("현재속도= "+ speed);				
			} else if (keyCode == 2) { // 2를 읽었을 경우
				speed--;
				System.out.println("현재속도= "+ speed);
			} else if (keyCode == 3) { // 3을 읽었을 경우
				run = false;
			}			
		}
		
		System.out.println("프로그램 종료");
	}

}
