package inheritance;

public class Car {
	String color;
	int price;
	Car() {
		
	}
	
	Car(String _color){ // 1
		System.out.println("Car ������(color)");
	}
	Car(int _price){ // 2
		System.out.println("Car ������(price)");
	}
	
	
	Car(String _color,int _price){ // 3
		System.out.println("Car ������(_color,_price)");
		this.color = _color;
		this.price = _price;
	}
	
	void drive() {
		System.out.println("Car ������");
	}

}
