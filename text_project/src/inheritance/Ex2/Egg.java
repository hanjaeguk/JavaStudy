package inheritance.Ex2;

public class Egg extends Product{
	Egg(int i){
		super.price = 100*i;
		System.out.println("´Þ°¿"+i+"°³:"+price+"¿ø");
	}
}
