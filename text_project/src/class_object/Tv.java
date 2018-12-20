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
	boolean mute = false; // 음소거 아닌 상태

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
				System.out.println("볼륨업!!");
				System.out.println("현재볼륨:" + curVolume);
			} else if (curVolume == 50) {
				System.out.println("최대볼륨입니다.");
				System.out.println("현재볼륨:" + curVolume);

			}
		}
	}

	void volumeDown() {
		if (power) {
			if (curVolume < 50 && curVolume >= 0) {
				curVolume -= 1;
				System.out.println("볼륨다운!!");
				System.out.println("현재볼륨:" + curVolume);
			} else if (curVolume == 0) {
				System.out.println("최소볼륨입니다.");
				System.out.println("현재볼륨:" + curVolume);

			}
		}
	}

	void mute() {
		if (power) {
			if (mute == true) { 
				curVolume = tempVolume;
				mute = false;
				System.out.println("음소거 해제");
				System.out.println("현재음량:" + curVolume);

			} else if (mute == false) { 
				tempVolume = curVolume;
				curVolume = minVolume;
				mute = true;
				System.out.println("음소거");
				System.out.println("현재음량:" + curVolume);

			}
		}
	}

	int chanelUp() {
		if (power) {
			if (channel < 100 && channel > 0) {
				channel = channel + 1;
				System.out.println("채널업!");
				System.out.println("현재채널:" + channel);
				return channel;
			} else {
				channel = 1;
				System.out.println("채널업!");
				System.out.println("현재채널:" + channel);
				return channel;
			}
		}
		return channel;
	}

	int chanelDown() {
		if (power) {
			if (channel < 100 && channel > 1) {
				channel = channel - 1;
				System.out.println("채널다운!");
				System.out.println("현재채널:" + channel);
				return channel;
			}else {
				channel = 100;
				System.out.println("채널다운!");
				System.out.println("현재채널:" + channel);
			}
		}
		return channel;
	}

	int changeChanel(int c_channel) {
		if (power) {
			if (c_channel <= 100 && c_channel > 0) {
				channel = c_channel; 
				System.out.println("채널변경!");
				System.out.println("변경채널:" + channel);
				return channel;
			}else {
				System.out.println("없는채널입니다.");
				return channel;
			}
		}
		return channel;
		
	}
}

//class : TV
//속 성 : 제조사    String maker
//        화면크기  int screenSize
//        채널      int chanel
//        볼륨      int volume
//        전원      boolean power
//
//기 능 : 켜기      void powerOn()
//        끄기      void powerOff() >>>>> power(boolean power)
//        한채널위  int chanelUp()
//        한채널아래int chanelDown()
//        채널변경  int changeChanel(int chanel)
//        볼륨업    void volumeUp()
//        볼륨다운  void volumeDown()
//        음소거    void mute()