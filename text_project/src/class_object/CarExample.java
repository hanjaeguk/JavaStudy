package class_object;

public class CarExample {

	public static void main(String[] args) {
		Car mycar = new Car("���׽ý�");
		System.out.println(mycar.company);
		System.out.println(mycar.model);
		System.out.println(mycar.color);
		System.out.println(mycar.maxSpeed);
		mycar.maxSpeed=300;
		System.out.println("�ְ�ӵ�����:"+mycar.maxSpeed);
		
		Car sCar = new Car("BMW","S�ø���");
		System.out.println(sCar.company);
		System.out.println(sCar.model);
		System.out.println(sCar.color);
		System.out.println(sCar.maxSpeed);
				
		
		
	}

}


//���� ������ ���� ������ �� ���� �ȿ��� �Ʒ��� ���� �߰��ص���
class Car{
	//�ʵ�
	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "����";
	int maxSpeed = 350;
	int speed;
	
	Car(String _model){
		model=_model;
	}
	
	Car(String _company,String _model){
		company = _company;
		model=_model;
	}
	
	
	//Car(){}; //������ ����� ����
	
	
}
