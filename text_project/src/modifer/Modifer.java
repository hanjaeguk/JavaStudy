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
	private int a = 10; // field private -> 클래스 내부에서는 접급이 가능 (외부접근불가)
	A(){} // constructor(생성자)
	
	void printa() { // Method
		System.out.println(a);
	}
	//Getter // a를 private로 해놨지만 외부에서 a를 가져가게 해주는것
	int getA() {
		return this.a;
	}
	//Setter // a를 private로 해놨지만 외부에서 a를 수정(입력)하게 해주는것
	void setA(int _a) {
		this.a=_a;
	}
}
