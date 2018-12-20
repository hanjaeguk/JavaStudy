package apipr;

import java.util.StringTokenizer;

public class Ex1 {
	public static void main(String[] args) {
		String str = "보름이는..수컷이고.4개월입니다.";

		StringTokenizer strToken = new StringTokenizer(str, ".");
		int countTokens = strToken.countTokens();
		for (int i = 0; i < countTokens; i++)
			System.out.println("문자열: " + strToken.nextToken());

		System.out.println("----------------------------");

		String values[] = str.split("\\.");
		System.out.println(values.length);
		for (int i = 0; i < values.length; i++) {
			System.out.println("문자열: " + values[i]);
		}

	}
}
