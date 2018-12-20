package starCraft;

public class Worker extends Unit {

	Worker() {
		super("worker");
		super.hp = 50;
		super.mp = 0;
		super.power = 5;
		super.speed = 3;
	}

	int money = 0;

	void mind(int x, int y) {
		if (x == 10 && y == 10) {
			money += 10;
			System.out.println("�̳׶� ĺ��!!");
			System.out.println("���� �̳׶�:" + money);
		}
	}

	void attack(SCV scv) {
		if (scv.hp > 0) {
			scv.hp -= super.power;
		} else {
			System.out.println("��밡 �����߽��ϴ�.");
		}
	}

	void attack(Marine marine) {
		if (marine.hp > 0) {
			marine.hp -= super.power;
		} else {
			System.out.println("��밡 �����߽��ϴ�.");
		}
	}

}
