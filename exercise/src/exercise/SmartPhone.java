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
//		int discountPrice = price-(price*(discountRate/100));
//		this.discountRate = discountRate;
//		this.price =price;
//				(int)(this.price-(this.price*((double)(discountRate)/100)));
		double discount = this.price-(this.price*((double)(discountRate*0.01)));
		this.price = (int)discount;

		
		System.out.println(name+" ["+maker+"]");
		System.out.println("가격:"+price);
		System.out.println("할인가격:"+discount);
		System.out.println("-------------");
	}
	//http://blog.naver.com/PostView.nhn?blogId=khm900402&logNo=220287200351
	public Integer calculateDiscount() {
		double discount = this.price-(this.price*((double)(discountRate/100)));
		this.price = (int)discount;
		return price;
	}
	
	

}
