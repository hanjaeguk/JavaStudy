package apipr;

import java.util.StringTokenizer;

public class Ex {
	public static void main(String[] args) {
		String str = "�ڹ�1&�ڹ�2,�ڹ�3,�ڹ�4-�ڹ�5";
		String[] javas = str.split("&|,|-");
		for (int i = 0; i<javas.length;i++) {
			System.out.println(javas[i]);
		}
		
		System.out.println("-----------------");
		
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";
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
