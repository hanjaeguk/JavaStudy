package inheritance.protectedKeyword;

public class SportCar2 extends Car2 {
	public void speedUp() {
		speed += 10;
	}

	 //final �޼ҵ� �������̵� �Ұ�!!!
//	@Override
//	public void stop() {
//		System.out.println("sportCar Stop");
//		speed = 0;
//	}
	
	public void carInstance() {
		Car2 car = new Car2();
		car.speedUp();		
	}
	
}
