package inheritance.Ex2;

public class Banana extends Product {
	Banana(int i){
		super.price=1000*i;
		System.out.println("바나나"+i+"개:"+price+"원");
	}

}
