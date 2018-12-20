package inheritance.Ex2;

public class CustomerExample {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.buy(new Banana(3)); // i = 0
		customer.buy(new Milk(1)); // i = 1
		customer.buy(new Egg(1)); // i = 2
		customer.buy(new Bread(4)); // i = 3
		customer.buy(new Bread(4)); // i = 3
		customer.buy(new Bread(4)); // i = 3
		customer.buy(new Bread(4)); // i = 3
		customer.buy(new Bread(4)); // i = 3
		customer.buy(new Bread(4)); // i = 3
		customer.TotalPrice();
		System.out.println(customer.getMoney());
		customer.setMoney(10000);
		System.out.println(customer.getMoney());
		
		
	}

}
