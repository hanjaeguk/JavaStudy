package nestedclassInterface;

public class Outter {
	String outter = "Outter field";
	
	void method() {
		System.out.println("Outter method");
	}
	
	//��û class
	class NestedClass{
		String nested = "nested field";
		
		void method() {
			System.out.println("Nested method");
		}
	}
	
}
