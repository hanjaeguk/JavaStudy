package homework_day6;

class Day6_pro4 {
	static boolean isNumber(String str) {
		for (int i = 0; i < str.length(); i++) {
			int s = str.charAt(i);
			if (s < 48 || s > 57) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까?" + isNumber(str));
		str = "123asd";
		System.out.println(str + "는 숫자입니까?" + isNumber(str));

	}

}

