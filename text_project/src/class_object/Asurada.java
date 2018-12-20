package class_object;

public class Asurada {
	int gas = 200;
	int maxSpeed = 300;
	int curSpeed = 0;
	String mode; // D(drive) R(return) B(booster) S(stop)
	String master;
	boolean power;

	Asurada() {
		System.out.println("������");
	}

	Asurada(String _master) {
		master = _master;
		System.out.println("�ȳ�" + master);
	}

	void transfer(String _mode) {
		if (power) {
			if (_mode == "D" && _mode == "R") {
				System.out.println("��庯ȯ �ȵ� -> ���� D����");
			} else if (_mode == "R" && (_mode == "D" || _mode == "B")) {
				System.out.println("��庯ȯ �ȵ� -> ���� R����");
			}
			mode = _mode;
		}
	}

	void run() { // �ѹ� ���� �Ҷ����� gas-5
		if (power) {
			if (mode == "D" && gas >= 5) {
				curSpeed += 10;
				System.out.println("����!!");
				System.out.println("����ӵ�:" + curSpeed);
				gas -= 5;
				System.out.println("���簡�� �ܷ�:" + gas);
			} else if (mode == "D" && gas < 5) {
				System.out.println("��������!!");
			} else if (mode == "B") {

			}
		}

	}

	void booster() { // 5�ʵ��� �ְ�ӵ�
		int tempSpeed;
		if (power) {
			if (mode == "B" && gas >= 10) {
				tempSpeed = curSpeed;
				curSpeed = maxSpeed;
				gas -= 10;
				System.out.println("�ν���!!!");
				System.out.println("����ӵ�:"+maxSpeed);
				System.out.println("�����ܷ�:"+gas);
				for (int i = 5; i > 0; i--) { // 5..4..3..2..1..
					try {
						System.out.println(i+"��");
						Thread.sleep(1000); // 1000 -> 1��
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Booster Off");
				curSpeed = tempSpeed;
				System.out.println("����ӵ�:"+curSpeed);
			}
		}
	}
	

	void stop() {
		if (power && mode == "S") {
			if (mode == "S" && curSpeed >= 20) {
				curSpeed -= 20;
				System.out.println("����");
				System.out.println("����ӵ�:" + curSpeed);
			} else if (mode == "S" && curSpeed < 20) {
				curSpeed = 0;
				System.out.println("����");
				System.out.println("����ӵ�:" + curSpeed);

			}
		}
	}

	void PowerOn(String Key) {
		if (Key.equals(master)) {
			power = true;
			System.out.println("�õ�!!");
		} else {
			System.out.println("���ٱ����� �����ϴ�.");
		}
	}

	void PowerOff(String Key) {
		if (Key.equals(master)) {
			power = false;
			System.out.println("�õ�����!!");
		} else {
			System.out.println("���ٱ����� �����ϴ�.");
		}
		power = false;
	}
}
