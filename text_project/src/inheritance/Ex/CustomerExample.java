package inheritance.Ex;

public class CustomerExample {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.buy(new Banana()); // i = 0
		customer.buy(new Milk()); // i = 1
		customer.buy(new Egg()); // i = 2
		customer.buy(new Bread()); // i = 3
		customer.TotalPrice();
		
		
	}

}
