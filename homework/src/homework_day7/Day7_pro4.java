package homework_day7;

public class Day7_pro4 {
	static void action(Robot RO) {
		if (RO instanceof DanceRobot) {
			RO = (DanceRobot) RO;
			DanceRobot.dance();
		} else if (RO instanceof SingRobot) {
			RO = (SingRobot) RO;
			SingRobot.sing();
		} else if (RO instanceof DrawRobot) {
			RO = (DrawRobot) RO;
			DrawRobot.draw();
		}

	}

	public static void main(String[] args) {

		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };

		for (int i = 0; i < arr.length; i++) {
			action(arr[i]);
		}
	} // main
}

class Robot {
}

class DanceRobot extends Robot {
	static void dance() {
		System.out.println("ÃãÃß´Â·Îº¿");
	}
}

class SingRobot extends Robot {
	static void sing() {
		System.out.println("³ë·¡ºÎ¸£´Â·Îº¿");
	}
}

class DrawRobot extends Robot {
	static void draw() {
		System.out.println("±×¸²±×¸®´Â·Îº¿");
	}

}
