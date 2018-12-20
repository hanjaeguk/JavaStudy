package inheritance.finalKeyword;

public class SportCar extends Car {
	public void speedUp() {
		speed += 10;
	}

	 //final 메소드 오버라이딩 불가!!!
//	@Override
//	public void stop() {
//		System.out.println("sportCar Stop");
//		speed = 0;
//	}

}
