package homework_day1_day5;

public class Day1_pro9 {
	public static void main(String[] args) {
		char ch = 'A';
		char lowerCase = (char) ((ch >= 65 && ch <= 96)?(ch+32):ch);
		
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
		
	}

}
