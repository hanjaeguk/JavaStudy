package exercise;

public class Ex_02 {

	public static void main(String[] args) {
		int java = 24000;
		int jQuery = 21000;
		int oracle = 19000;
		int spring = 35000;
		int sum = java + jQuery + oracle + spring;
		int discount = sum - ((int) (sum*0.15));

		System.out.println("====���� ���� ���====");
		System.out.println("JAVA" + java);
		System.out.println("JQuery" + jQuery);
		System.out.println("����Ŭ" + oracle);
		System.out.println("������" + spring);
		System.out.println("-----------------");
		System.out.println("�ֹ� �ѱݾ�:" + sum +"��");
		System.out.println("������ ���� �ݾ� :" + discount+"��");

	}

}
