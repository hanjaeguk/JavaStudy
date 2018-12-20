package class_object;

public class Asurada {
	int gas = 200;
	int maxSpeed = 300;
	int curSpeed = 0;
	String mode; // D(drive) R(return) B(booster) S(stop)
	String master;
	boolean power;

	Asurada() {
		System.out.println("곤니찌와");
	}

	Asurada(String _master) {
		master = _master;
		System.out.println("안녕" + master);
	}

	void transfer(String _mode) {
		if (power) {
			if (_mode == "D" && _mode == "R") {
				System.out.println("모드변환 안됨 -> 현재 D상태");
			} else if (_mode == "R" && (_mode == "D" || _mode == "B")) {
				System.out.println("모드변환 안됨 -> 현재 R상태");
			}
			mode = _mode;
		}
	}

	void run() { // 한번 가속 할때마다 gas-5
		if (power) {
			if (mode == "D" && gas >= 5) {
				curSpeed += 10;
				System.out.println("가속!!");
				System.out.println("현재속도:" + curSpeed);
				gas -= 5;
				System.out.println("현재가스 잔량:" + gas);
			} else if (mode == "D" && gas < 5) {
				System.out.println("가스부족!!");
			} else if (mode == "B") {

			}
		}

	}

	void booster() { // 5초동안 최고속도
		int tempSpeed;
		if (power) {
			if (mode == "B" && gas >= 10) {
				tempSpeed = curSpeed;
				curSpeed = maxSpeed;
				gas -= 10;
				System.out.println("부스터!!!");
				System.out.println("현재속도:"+maxSpeed);
				System.out.println("가스잔량:"+gas);
				for (int i = 5; i > 0; i--) { // 5..4..3..2..1..
					try {
						System.out.println(i+"초");
						Thread.sleep(1000); // 1000 -> 1초
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Booster Off");
				curSpeed = tempSpeed;
				System.out.println("현재속도:"+curSpeed);
			}
		}
	}
	

	void stop() {
		if (power && mode == "S") {
			if (mode == "S" && curSpeed >= 20) {
				curSpeed -= 20;
				System.out.println("감속");
				System.out.println("현재속도:" + curSpeed);
			} else if (mode == "S" && curSpeed < 20) {
				curSpeed = 0;
				System.out.println("감속");
				System.out.println("현재속도:" + curSpeed);

			}
		}
	}

	void PowerOn(String Key) {
		if (Key.equals(master)) {
			power = true;
			System.out.println("시동!!");
		} else {
			System.out.println("접근권한이 없습니다.");
		}
	}

	void PowerOff(String Key) {
		if (Key.equals(master)) {
			power = false;
			System.out.println("시동종료!!");
		} else {
			System.out.println("접근권한이 없습니다.");
		}
		power = false;
	}
}
