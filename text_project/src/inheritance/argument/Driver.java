package inheritance.argument;

public class Driver {
	void driver(Bus bus) {
		bus.run();
		bus.price();
	}
	
	void driver(Texi texi) {
		texi.run();
		texi.price();
	}
	
	//�پ缺
	void driver(Vehicle vehicle) {
		vehicle.run();
		// vehicle.price(); // �۵�X
	}

}
