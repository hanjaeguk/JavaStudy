package inheritance.Ex2;

public class Milk extends Product{
	Milk(int i){
		super.price=2000*i;
		System.out.println("우유"+i+"개:"+price+"원");
	}

}
