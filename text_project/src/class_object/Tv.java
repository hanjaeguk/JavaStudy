package class_object;

public class Tv {
	String maker;
	int screenSize;
	int channel = 50;
	int curVolume = 10;
	int tempVolume = 0;
	int maxVolume = 50;
	int minVolume = 0;
	boolean power;
	boolean mute = false; // ���Ұ� �ƴ� ����

	void powerOn() {
		power = true;
		System.out.println("TV ON");
	}

	void powerOff() {
		power = false;
		System.out.println("TV OFF");
	}

	void volumeUp() {
		if (power) {
			if (curVolume < 50 && curVolume >= 0) {
				curVolume += 1;
				System.out.println("������!!");
				System.out.println("���纼��:" + curVolume);
			} else if (curVolume == 50) {
				System.out.println("�ִ뺼���Դϴ�.");
				System.out.println("���纼��:" + curVolume);

			}
		}
	}

	void volumeDown() {
		if (power) {
			if (curVolume < 50 && curVolume >= 0) {
				curVolume -= 1;
				System.out.println("�����ٿ�!!");
				System.out.println("���纼��:" + curVolume);
			} else if (curVolume == 0) {
				System.out.println("�ּҺ����Դϴ�.");
				System.out.println("���纼��:" + curVolume);

			}
		}
	}

	void mute() {
		if (power) {
			if (mute == true) { 
				curVolume = tempVolume;
				mute = false;
				System.out.println("���Ұ� ����");
				System.out.println("��������:" + curVolume);

			} else if (mute == false) { 
				tempVolume = curVolume;
				curVolume = minVolume;
				mute = true;
				System.out.println("���Ұ�");
				System.out.println("��������:" + curVolume);

			}
		}
	}

	int chanelUp() {
		if (power) {
			if (channel < 100 && channel > 0) {
				channel = channel + 1;
				System.out.println("ä�ξ�!");
				System.out.println("����ä��:" + channel);
				return channel;
			} else {
				channel = 1;
				System.out.println("ä�ξ�!");
				System.out.println("����ä��:" + channel);
				return channel;
			}
		}
		return channel;
	}

	int chanelDown() {
		if (power) {
			if (channel < 100 && channel > 1) {
				channel = channel - 1;
				System.out.println("ä�δٿ�!");
				System.out.println("����ä��:" + channel);
				return channel;
			}else {
				channel = 100;
				System.out.println("ä�δٿ�!");
				System.out.println("����ä��:" + channel);
			}
		}
		return channel;
	}

	int changeChanel(int c_channel) {
		if (power) {
			if (c_channel <= 100 && c_channel > 0) {
				channel = c_channel; 
				System.out.println("ä�κ���!");
				System.out.println("����ä��:" + channel);
				return channel;
			}else {
				System.out.println("����ä���Դϴ�.");
				return channel;
			}
		}
		return channel;
		
	}
}

//class : TV
//�� �� : ������    String maker
//        ȭ��ũ��  int screenSize
//        ä��      int chanel
//        ����      int volume
//        ����      boolean power
//
//�� �� : �ѱ�      void powerOn()
//        ����      void powerOff() >>>>> power(boolean power)
//        ��ä����  int chanelUp()
//        ��ä�ξƷ�int chanelDown()
//        ä�κ���  int changeChanel(int chanel)
//        ������    void volumeUp()
//        �����ٿ�  void volumeDown()
//        ���Ұ�    void mute()