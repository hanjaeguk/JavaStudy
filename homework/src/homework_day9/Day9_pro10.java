package homework_day9;

import java.util.regex.Pattern;

public class Day9_pro10 {

	public static void main(String[] args) {
		String id = "5Angel1004";
		String regExp = "[a-zA-Z]{1}\\w{8,12}";
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("ID�� ����� �� �ֽ��ϴ�.");
		}else {
			System.out.println("ID�� ����� �� �����ϴ�.");
		}
	}

}
