package class_object;

public class Fighter_Ex {

	public static void main(String[] args) {
			Fighter myFighter = new Fighter();
			System.out.println("������:"+myFighter.pilot);
			System.out.println("���̴�:"+myFighter.rader);
			System.out.println("����:"+myFighter.engine);
			
		
		
	}

}

class Fighter{
	String pilot = "JG";
	double length = 51.4;
	double width = 35;
	double height = 14.2;
	double wing_area = 460;
	double weight = 29300;
	double arm_weight = 49540;
	double max_takeoff_weight = 70000;
	String rader = "AN/APG-81";
	String engine = "���� �� ��Ʈ�� F135";
	
	//������
	Fighter(){
		System.out.println("�������ϳ� �常�߽��ϴ�");
	}
	
	
	void fly() {
		System.out.println("�ϴ�������~~~");
	}
	
}
