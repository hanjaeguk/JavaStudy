package class_object;

public class Calculator {
	int c = 0;
	// �޼ҵ� ����?
	void add(int a, int b) { //���ϰ��� ������ int ������ void
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
		cal.add(5, 4); // 5���ϱ� 4�� �ؼ�
		cal.mux(2); // 2�� ���ؼ�
		cal.div(3); // 3���� ������.

	}

}
