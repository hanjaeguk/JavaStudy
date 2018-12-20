package homework_day7_pro3_Starcraft;

public class Dropship implements Unit {
	int att = 0;
	int HP = 100;
	int speed = 10;
	private String unit;

	String ar[] = new String[4];

	void load() {
		if (ar[0] == null) {
			ar[0] = unit;
		} else if (ar[1] == null) {
			ar[1] = unit;
		} else if (ar[2] == null) {
			ar[2] = unit;
		} else if (ar[3] == null) {
			ar[3] = unit;
		}
	}

	void unload() {
		if (ar[0] != null) {
			ar[0] = unit;
		} else if (ar[1] != null) {
			ar[1] = unit;
		} else if (ar[2] != null) {
			ar[2] = unit;
		} else if (ar[3] != null) {
			ar[3] = unit;
		}

	}
}
