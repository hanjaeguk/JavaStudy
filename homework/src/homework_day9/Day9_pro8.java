package homework_day9;

public class Day9_pro8 {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		String[] strs = str.split(",");
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}

}
