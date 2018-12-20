package nestedclassInterface.ex;

public class Anonymous { // 인터페이스 Vehicle 상속 안하고 익명개체로 구현했음 {} 안에 인터페이스 구현
						//implements 로 상속하는법 익명개체로 아래와같이 다이렉트로 하는번 두가지가있음.
	Vehicle field = new Vehicle() {

		@Override
		public void run() {
			System.out.println("자동차가 달립니다.");
		}
	};

	void method() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		localVar.run();
	}

	void method2(Vehicle v) {
		v.run();
	}
}