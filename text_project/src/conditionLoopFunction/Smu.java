package conditionLoopFunction;

import java.util.Scanner;

public class Smu {

	public static void main(String[] args) {
		int com = (int)(Math.random()*100); //0-99
		int me = 0;
		int cnt = 0;
		

		

		while(true) {
			
			System.out.print("입력:");
			Scanner sc = new Scanner(System.in);
			me = sc.nextInt();
			
		if(me < com) {
			System.out.println(me+"보다 큰수입니다.");			
		}else if(me > com) {
			System.out.println(me+"보다 작은수입니다.");
		}
		if(me == com) {
			System.out.println("정답입니다.");
			break;
		}
			cnt++;
			if (cnt == 20) {
				System.out.println("실패입니다!!!정답은 "+com+"입니다.");
				break;
			}
			
		
		}
		
	}

}
