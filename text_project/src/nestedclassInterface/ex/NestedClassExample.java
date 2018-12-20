package nestedclassInterface.ex;

public class NestedClassExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire(); // 로컬
		
		Car.Engine engine =new Car.Engine(); // 정적
		
		
	}

}
