package inheritance.Ex2;

public class Milk extends Product{
	Milk(int i){
		super.price=2000*i;
		System.out.println("����"+i+"��:"+price+"��");
	}

}
