package interface_object;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	public int MIN_VOLUME = 10; // static final ����

	public abstract void turnOn();

	public void turnOff(); // abstract ����

	public default void setMute(boolean mute) { // default�� �������� abstract�� �ν� 
		if (mute) {
			System.out.println("���Ұ�");
		} else {
			System.out.println("����");
		}
	}
	
	public static void changeBattery() {
		System.out.println("������ ��ȯ");
	}

}
