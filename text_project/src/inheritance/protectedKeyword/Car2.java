package inheritance.protectedKeyword;

import inheritance.finalKeyword.*;

public class Car2 {
	public int speed;

	public void speedUp() {
		speed += 1;
	}

	public final void stop() {
		System.out.println("Car Stop");
		speed = 0;
	}
	
	public void carInstance() {
		Car car = new Car();
		car.speedUp();
		
	}
	
}
