package apipr;

import java.util.StringTokenizer;

public class Ex {
	public static void main(String[] args) {
		String str = "자바1&자바2,자바3,자바4-자바5";
		String[] javas = str.split("&|,|-");
		for (int i = 0; i<javas.length;i++) {
			System.out.println(javas[i]);
		}
		
		System.out.println("-----------------");
		
		String text = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		System.out.println(countTokens);
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}

		System.out.println("-----------------");		
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}
