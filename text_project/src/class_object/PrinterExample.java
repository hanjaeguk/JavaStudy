package class_object;

public class PrinterExample {

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
	}

}
// 오버 로딩 - 같은 이름으로 만들어 놓고 알아서 쓰게 하는거
class Printer{
	void println(int a) {
		System.out.println(a);
	}
	void println(boolean a) {
		System.out.println(a);
	}
	
	void println(double a) {
		System.out.println(a);
	}
	
	void println(String a) {
		System.out.println(a);
	}
}