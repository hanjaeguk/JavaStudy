package inheritance.finalKeyword;

public class Car {
	public int speed;

	public void speedUp() {
		speed += 1;
	}

	public final void stop() {
		System.out.println("Car Stop");
		speed = 0;
	}
}
