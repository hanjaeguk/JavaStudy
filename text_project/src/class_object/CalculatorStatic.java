package class_object;

public class CalculatorStatic {

	public static void main(String[] args) {
//		Calculator2 cal2 = new Calculator2();
//		cal2.plus(10,20);
		Calculator2.plus(5, 3);
	}

}

class Calculator2 {
	static final double pi = 3.14; // »ó¼ö(¸ø¹Ù²Þ)

	static int plus(int x, int y) {
		return x + y;
	}
}