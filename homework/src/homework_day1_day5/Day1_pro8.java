package homework_day1_day5;

public class Day1_pro8 {
	public static void main(String[] args) {
		char ch = 'z';
		boolean b = (((ch >= 'a')&&(ch<='z'))||((ch >= 'A')&&(ch<='Z'))||((ch >= 0)&&(ch<=9)));
		
		System.out.println(b);
	}
}
