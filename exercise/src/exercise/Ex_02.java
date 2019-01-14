package exercise;

public class Ex_02 {

	public static void main(String[] args) {
		int java = 24000;
		int jQuery = 21000;
		int oracle = 19000;
		int spring = 35000;
		int sum = java + jQuery + oracle + spring;
		int discount = sum - ((int) (sum*0.15));

		System.out.println("====도서 구입 목록====");
		System.out.println("JAVA" + java);
		System.out.println("JQuery" + jQuery);
		System.out.println("오라클" + oracle);
		System.out.println("스프링" + spring);
		System.out.println("-----------------");
		System.out.println("주문 총금액:" + sum +"원");
		System.out.println("할인후 결제 금액 :" + discount+"원");

	}

}
