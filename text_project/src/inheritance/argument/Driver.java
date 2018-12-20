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
	
	//다양성
	void driver(Vehicle vehicle) {
		vehicle.run();
		// vehicle.price(); // 작동X
	}

}
