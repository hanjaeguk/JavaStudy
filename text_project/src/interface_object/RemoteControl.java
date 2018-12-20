package interface_object;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	public int MIN_VOLUME = 10; // static final 생략

	public abstract void turnOn();

	public void turnOff(); // abstract 생략

	public default void setMute(boolean mute) { // default를 안적으면 abstract로 인식 
		if (mute) {
			System.out.println("음소거");
		} else {
			System.out.println("해제");
		}
	}
	
	public static void changeBattery() {
		System.out.println("건전지 교환");
	}

}
