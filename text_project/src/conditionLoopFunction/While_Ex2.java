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
				System.out.println("1.���� | 2.���� | 3.����");
				System.out.println("--------------------");
				System.out.println("����");
			}
			
//			keyCode = System.in.read(); // �����ڵ�� ���ڰ� �ٲ�. Scanner�� ���� �� �״��
			Scanner sc = new Scanner(System.in);
			keyCode = sc.nextInt();
			System.out.println(keyCode);
			
			
			if(keyCode == 1) {  // 1�� �Ҿ��� ���
				speed++;
				System.out.println("����ӵ�= "+ speed);				
			} else if (keyCode == 2) { // 2�� �о��� ���
				speed--;
				System.out.println("����ӵ�= "+ speed);
			} else if (keyCode == 3) { // 3�� �о��� ���
				run = false;
			}			
		}
		
		System.out.println("���α׷� ����");
	}

}
