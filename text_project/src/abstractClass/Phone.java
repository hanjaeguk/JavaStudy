package abstractClass;

public abstract class Phone { // 추상클래스
	// 필드
	String owner;

	// 생성자
	Phone(String _owner) {
		this.owner = _owner;
	}

	// 메서드
	void turnOn() {
		System.out.println("ON!!");

	}

	void turnOff() {
		System.out.println("OFF!!");

	}

	public abstract void call(); // abstract가 있는 곳에서는 abstract클래스여야함 안적으면 public로 읽음

}
