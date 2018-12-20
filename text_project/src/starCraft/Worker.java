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
			System.out.println("미네랄 캤다!!");
			System.out.println("현재 미네랄:" + money);
		}
	}

	void attack(SCV scv) {
		if (scv.hp > 0) {
			scv.hp -= super.power;
		} else {
			System.out.println("상대가 전사했습니다.");
		}
	}

	void attack(Marine marine) {
		if (marine.hp > 0) {
			marine.hp -= super.power;
		} else {
			System.out.println("상대가 전사했습니다.");
		}
	}

}
