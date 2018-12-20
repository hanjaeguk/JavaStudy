package homework_day8;

class Outer{
	class Inner{
		int iv = 100;
	}
}

public class Day8_pro2 {

	public static void main(String[] args) {
		Outer ou = new Outer();
		Outer.Inner In= ou.new Inner();
		System.out.println(In.iv);
	}

}
