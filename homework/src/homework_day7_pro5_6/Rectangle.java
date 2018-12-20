package homework_day7_pro5_6;

public class Rectangle extends Shape {
	double width;
	double height;

	@Override
	double calcArea() {

		return width * height;
	}

	boolean isSquare() {
		if (width == height) {
			return true;
		} else {
			return false;
		}

	}

}
