package class_object;

public class Fighter_Ex {

	public static void main(String[] args) {
			Fighter myFighter = new Fighter();
			System.out.println("조종사:"+myFighter.pilot);
			System.out.println("레이더:"+myFighter.rader);
			System.out.println("엔진:"+myFighter.engine);
			
		
		
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
	String engine = "프랫 앤 휘트니 F135";
	
	//생성자
	Fighter(){
		System.out.println("전투기하나 장만했습니다");
	}
	
	
	void fly() {
		System.out.println("하늘을난다~~~");
	}
	
}
