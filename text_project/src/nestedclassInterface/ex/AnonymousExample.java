package nestedclassInterface.ex;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method();
		anony.method2(
			new Vehicle() {
			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
				} // 메소드 만들어 안에 익명개체
			}

		);

	}

}
