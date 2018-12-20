package inheritance.Ex2;

public class Bread extends Product{
	Bread(int i){
		super.price=1500*i;
		System.out.println("»§"+i+"°³:"+price+"¿ø");
	}

}
