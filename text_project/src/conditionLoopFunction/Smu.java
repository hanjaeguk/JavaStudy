package conditionLoopFunction;

import java.util.Scanner;

public class Smu {

	public static void main(String[] args) {
		int com = (int)(Math.random()*100); //0-99
		int me = 0;
		int cnt = 0;
		

		

		while(true) {
			
			System.out.print("�Է�:");
			Scanner sc = new Scanner(System.in);
			me = sc.nextInt();
			
		if(me < com) {
			System.out.println(me+"���� ū���Դϴ�.");			
		}else if(me > com) {
			System.out.println(me+"���� �������Դϴ�.");
		}
		if(me == com) {
			System.out.println("�����Դϴ�.");
			break;
		}
			cnt++;
			if (cnt == 20) {
				System.out.println("�����Դϴ�!!!������ "+com+"�Դϴ�.");
				break;
			}
			
		
		}
		
	}

}
