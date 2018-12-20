package interface_object;

public abstract class Tv implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("TV on");
	}

	@Override
	public void turnOff() {
		System.out.println("TV off");
	}

}
