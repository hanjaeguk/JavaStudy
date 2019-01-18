package exercise;

public class SmartPhone {
	private String maker;
	private String name;
	private int price;
	private int discountRate;
	
	public SmartPhone(String maker, String name, int price) {
		System.out.println(name+" ["+maker+"]");
		System.out.println("가격:"+price);
		System.out.println("-------------");
	}
	public SmartPhone(String maker, String name, int price,int discountRate) {
		double discount = price-(price*((double)(discountRate*0.01)));
		this.price = (int)discount;
		
		System.out.println(name+" ["+maker+"]");
		System.out.println("가격:"+price);
		System.out.println("할인가격:"+this.price);
		System.out.println("-------------");
	}

	public Integer calculateDiscount() {
		return price;
	}
	
	

}
