package class_object;

public class CarEX {
	int Speed;

	void run() {
		System.out.println(Speed + "으로 달립니다.");
	}

	public static void main(String[] args) {
		CarEX myCar = new CarEX();
		myCar.Speed = 60;
		myCar.run();
	}
}
