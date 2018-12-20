package homework_day7;

class MyTv {
	boolean isPowerOn;
	int volume;
	int channel;
	int preCH;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	int setChannel(int _channel) {
		preCH = this.channel;
		this.channel = _channel;
		return _channel;
	}

	int getChannel() {
		return channel;
	}

	int setVolume(int _volume) {
		this.volume = _volume;
		return _volume;
	}

	int getVolume() {
		return volume;
	}

	void gotoPrevChannel() {
		int preCH2;
		preCH2 = this.channel;
		this.channel = preCH;
		preCH = preCH2;
	}

}

public class Day7_pro1_2 {

	public static void main(String[] args) {
		MyTv t = new MyTv();

		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());

		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());

		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());

		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());

		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
	}

}
