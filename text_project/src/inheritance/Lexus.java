package inheritance;

public class Lexus extends Car {
	Lexus() {
		super("������",1000);
		System.out.println("Lexus ������");
	}

	void driveBack() {
		System.out.println("������");
	}
	@Override  // �Ϲ������� ������ �θ� Ŭ������ �ִ� �޼ҵ带 ������������ �ٲٱ�
	void drive() {
		System.out.println("Lexus ������");
	}
}
