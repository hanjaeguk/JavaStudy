package interface_object;

public class RemoteControlExample {

	public static void main(String[] args) {
//		Tv tv = new Tv();  //abstract ±¸Çö 
//		tv.turnOn();
//		tv.turnOff();
//		tv.setMute(true);
		
		Audio audio = new Audio();
		audio.turnOn();
		audio.turnOff();
		audio.setMute(true);
		RemoteControl.changeBattery();

		LGTV lgtv = new LGTV();
		lgtv.turnOff();
		
		RemoteControl rc = null;
		rc = audio;
		rc.turnOn();
		rc.turnOff();
	
	}

}
