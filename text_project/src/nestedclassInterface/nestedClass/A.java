package nestedclassInterface.nestedClass;

public class A {
	A(){
		System.out.println("A()");
	}
	
	B field1 = new B();
	C field2 = new C();
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
//	static B field3 = new B();
	static C field4 = new C();
	
	static void method2() {
//		B var1 = new B();
		C var2 = new C();
	}
	
	int field5;
	void method3() {System.out.println();}
	static int field6;
	static void method4() {System.out.println();}
	
	
	
	class B{
		B(){System.out.println("B()");}
		int fieldB;
//		static int sfieldB;
		
//		field1 = 10;
//		field2 = 10;
//		filed4;
//		method1();
//		method2();
		
		void methodB() {
		field5 = 10;
		method3();
		field6 = 10;
		method4();
		}
		
		
//		void methodB() {}
//		static void smethodB() {}
		
		//메서드 내부에서 생성되서 사용불가
//		D d1 = new D();
	}
	
	static class C{
		C(){System.out.println("C()");}
		int fieldC;
		static int sfieldC;
		void methodC() {}
		static void sMethodC() {}
	}
	
	void method(int arg1,int arg2) {
		final int var1 = 1;
		int var2 = 2;
		class D{
			D(){System.out.println("D()");}
			int fieldD=100;
//			static int sfieldD;
			void methodD() {
				System.out.println(var1+var2+arg1+arg2);
			}
//			static sMethodD() {}
			
			
		}
		
		//메서드 내부에서 사용 용도로 만듬
		D d = new D();
		d.fieldD = 10;
		d.methodD();
	}

}
