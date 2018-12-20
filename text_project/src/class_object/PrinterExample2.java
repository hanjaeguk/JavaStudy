package class_object;

public class PrinterExample2 {
	int a;
	boolean b;
	double c;
	String d;
	
	void print() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

	public static void main(String[] args) {
		PrinterExample2 PE = new PrinterExample2();
		PE.a=10;
		PE.b=true;
		PE.c=5.7;
		PE.d="ȫ�浿";
		PE.print();
		
	}

}
