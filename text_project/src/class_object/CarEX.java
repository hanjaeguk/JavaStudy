package class_object;

public class CarEX {
	int Speed;

	void run() {
		System.out.println(Speed + "���� �޸��ϴ�.");
	}

	public static void main(String[] args) {
		CarEX myCar = new CarEX();
		myCar.Speed = 60;
		myCar.run();
	}
}
