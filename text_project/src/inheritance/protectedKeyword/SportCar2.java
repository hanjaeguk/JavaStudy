package inheritance.protectedKeyword;

public class SportCar2 extends Car2 {
	public void speedUp() {
		speed += 10;
	}

	 //final 메소드 오버라이딩 불가!!!
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
