package inheritance.Ex2;

public class Customer {
	int a = 5;
	int i = 0;
	Product[] pro = new Product[a];
	private int money = 10000;

	void buy(Product p) {
		if (i < a) {
			pro[i++] = p;
		} else {
			Product[] temp = new Product[a * 2];
			for (int j = 0; j < a; j++) {
				temp[j] = pro[j];
			}
			a = a * 2;
			pro = new Product[a];
			for (int j = 0; j < a; j++) {
				pro[j] = temp[j];
			}
			pro[i++] = p; 

		}
	}

	void TotalPrice() {
		int sum = 0;
		for (int j = 0; j < i; j++) {
			sum = sum + pro[j].price;
		}
		if (sum > money) {
			System.out.println("µ·ºÎÁ·!!!");
		} else {
			money = money-sum;
			System.out.println("ÃÑÇÕ:" + sum + "¿ø");
			System.out.println("³²Àºµ·:"+ money);
		}

	}
	
	int getMoney() {
		return this.money;
	}
	
	
	int setMoney(int money) {
		this.money += money;
		return money;
	}
	
	
	
	
}
