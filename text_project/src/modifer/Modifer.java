package modifer;

public class Modifer {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.getA());
		a.printa();
		a.setA(20);
		System.out.println(a.getA());
		
	}

}

class A{
	private int a = 10; // field private -> Ŭ���� ���ο����� ������ ���� (�ܺ����ٺҰ�)
	A(){} // constructor(������)
	
	void printa() { // Method
		System.out.println(a);
	}
	//Getter // a�� private�� �س����� �ܺο��� a�� �������� ���ִ°�
	int getA() {
		return this.a;
	}
	//Setter // a�� private�� �س����� �ܺο��� a�� ����(�Է�)�ϰ� ���ִ°�
	void setA(int _a) {
		this.a=_a;
	}
}
