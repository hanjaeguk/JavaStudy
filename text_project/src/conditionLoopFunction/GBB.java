package conditionLoopFunction;

import java.util.Scanner;

public class GBB {

	public static void main(String[] args) {
		int com = (int)(Math.random()*3); //0-2,0=����,1=����,2=��
		int me = 0;
		int result =3;
		
		String myStr = null,comStr = null,resultStr = null;
		
		Scanner sc = new Scanner(System.in);
		me = sc.nextInt();
		
		
		result = ((com-me)+2)%3;
		
		switch(result) {
		case 2: resultStr = "�����ϴ�."; break; 
		case 1: resultStr = "����� �̰���ϴ�."; break;
		case 0: resultStr = "��ǻ�Ͱ� �̰���ϴ�."; break;
		}
		
		switch (com) {
		case 2:
			comStr = "��";
			break;
		case 1:
			comStr = "����";
			break;
		case 0:
			comStr = "����";
			break;
		}
	
		switch (me) {
		case 2:
			myStr = "��";
			break;
		case 1:
			myStr = "����";
			break;
		case 0:
			myStr = "����";
			break;
		}
			
			System.out.println(com);
			System.out.println("��ǻ��: "+ comStr);
			System.out.println(me);
			System.out.println("����: "+ myStr);
			System.out.println(resultStr);
			
		
		
		
		
	}

}
