package inheritance.car;

public class Tire {
	public int maxRotation; // �ִ� ȸ����(����)
	public int accumulateRotaion;
	public String location;
	
	
	Tire(String location,int maxRotation){
		this.location=location;
		this.maxRotation=maxRotation;
	}
	
	boolean roll() {
		accumulateRotaion++;
		if(accumulateRotaion < maxRotation) {
			return true;
		} else {
			System.out.println(location+" Ÿ�̾ ��ü���ּ���. ");
			return false;
		}
		
		
	}
	
	
}
