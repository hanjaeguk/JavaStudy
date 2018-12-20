package homework_day7_pro3_Starcraft;

public class Tank implements Unit {
	int att = 10;
	int HP = 100;
	int speed = 10;
	int attRange = 10;

	void changeMode() {
		speed = 0;
		att += 20;
		speed = 0;
		attRange += 10;
	}
}
