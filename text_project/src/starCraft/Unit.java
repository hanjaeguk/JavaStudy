package starCraft;

public class Unit {
	int hp;
	int mp;
	int power;
	int speed;
	int armer;
	String type;
	
	Unit(String type){
		this.type = type;
	}
	
	void move(int x, int y) {
		System.out.println("x��:"+x+"y��:"+y+"�� �̵��մϴ�.");
	
	}
}
