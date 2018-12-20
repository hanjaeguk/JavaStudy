package inheritance.car;

public class Tire {
	public int maxRotation; // 최대 회전수(수명)
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
			System.out.println(location+" 타이어를 교체해주세요. ");
			return false;
		}
		
		
	}
	
	
}
