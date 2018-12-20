package homework_day8;

class Outer3 {
	int value = 10;

	class Inner3 {
		int value = 20;

		void method1() {
			int value = 30;
			System.out.println(Outer3.this.value);
			System.out.println(this.value);
			System.out.println(value);
		}
	} // Inner3
} // Outer3

public class Day8_pro4 {

	public static void main(String[] args) {
		Outer3 o3 = new Outer3();
		Outer3.Inner3 i3 = o3.new Inner3();
		
		i3.method1();
	} // main

}
