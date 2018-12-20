package homework_day8;
class Outer2{
	static class Inner2{
		int iv = 200;
	}
}

public class Day8_pro3 {

	public static void main(String[] args) {
		Outer2.Inner2 i = new Outer2.Inner2();
		System.out.println(i.iv);
		

	}

}
