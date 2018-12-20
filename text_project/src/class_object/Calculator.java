package class_object;

public class Calculator {
	int c = 0;
	// 메소드 생성?
	void add(int a, int b) { //리턴값이 있으면 int 없으면 void
		c=a+b;
		System.out.println(a+b);
		//return a+b;
	}

	void minus(int a, int b) {
		System.out.println(a-b);
	}

	void mux(int a) {
		c=c*a;
		System.out.println(c);
	}

	void div(int a) {
		c=c/a;
		System.out.println(c);	
		}
	
	void mod(int a, int b) {
		System.out.println(a%b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
//		System.out.println(cal.add(5,6));
//		System.out.println(cal.minus(5,6));
//		System.out.println(cal.mux(5,6));
//		System.out.println(cal.div(5,6));
//		System.out.println(cal.mod(5,6));
		cal.add(5, 4); // 5더하기 4를 해서
		cal.mux(2); // 2를 곱해서
		cal.div(3); // 3으로 나눈다.

	}

}
