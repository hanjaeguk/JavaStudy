package inheritance;

public class Lexus extends Car {
	Lexus() {
		super("검은색",1000);
		System.out.println("Lexus 생성자");
	}

	void driveBack() {
		System.out.println("후진중");
	}
	@Override  // 일반적으로 적어줌 부모 클래스에 있는 메소드를 렉서스용으로 바꾸기
	void drive() {
		System.out.println("Lexus 전진중");
	}
}
