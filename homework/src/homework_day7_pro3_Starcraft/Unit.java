package homework_day7_pro3_Starcraft;

public interface Unit {
	default void move(int _x, int _y) {
		int x = _x, y = _y;
	}

	default void stop() {
		int speed = 0;
	}
}
