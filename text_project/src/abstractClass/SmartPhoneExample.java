package abstractClass;

public class SmartPhoneExample {

	public static void main(String[] args) {
//		Phone phone = new Phone("Hi");
		SmartPhone sp = new SmartPhone("hi");
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();
		sp.call();
	}

}
