package inheritance.polymorphism;

public class PromotionExample {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		A a1 = new B();
		a1 = new C();
		a1 = new D();
		a1 = new E();
		
		B b1 = new D();
		C c1 = new E();
//		D d1 = new A(); // 할아버지 할머니 클래스 못받음
		
	}

}

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}