package homework_day7_pro3_Starcraft;

public class Marine implements Unit {
	int att = 10;
	int HP = 100;
	int speed = 10;
	int attRange = 10;

	void stimPack() {
		att += 10;
		HP -= 10;
		speed += 5;
	}
}
