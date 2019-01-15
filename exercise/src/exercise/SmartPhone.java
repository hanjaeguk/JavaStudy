package exercise;

public class SmartPhone {
	String maker;
	String name;
	int price;
	int discountRate;
	
	public SmartPhone(String maker, String name, int price) {
		System.out.println(name+" ["+maker+"]");
		System.out.println("가격:"+price);
		System.out.println("-------------");
	}
	public SmartPhone(String maker, String name, int price,int discountRate) {
		this.discountRate = discountRate;
		this.price = price;
		System.out.println(name+" ["+maker+"]");
		System.out.println("가격:"+price);
		System.out.println("할인가격:"+this.price);
		System.out.println("-------------");
	}
	
	public Integer calculateDiscount() {
		this.price = price-(price*(discountRate/100));
		return this.price;
	}
	
	

}
