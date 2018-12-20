package generic;

public class ProductExample {

	public static void main(String[] args) {
		Product <Car,String>  car  = new Product<Car,String>();
		car.setKing(new Car());
		car.setModel("람보르기니");
		
		System.out.println(car.getKind().kind);
		System.out.println(car.getModel());
		
	}

}
