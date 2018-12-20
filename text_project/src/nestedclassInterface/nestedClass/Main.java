package nestedclassInterface.nestedClass;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B(); // 인스턴스
		b.fieldB = 100;
		b.methodB();
		
		A.C c = new A.C(); // static 정적
		c.fieldC = 100;
		c.methodC();
		
		a.method(0, 0); // class 생성
	}
}
