package class_object;

public class PrinterExample {

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("ȫ�浿");
		
	}

}
// ���� �ε� - ���� �̸����� ����� ���� �˾Ƽ� ���� �ϴ°�
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