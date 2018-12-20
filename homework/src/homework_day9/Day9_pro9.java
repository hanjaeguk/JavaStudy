package homework_day9;

public class Day9_pro9 {

	public static void main(String[] args) {
		String str = "";
		for(int i = 1;i<=100;i++) {
			str += i;
		}
		
		System.out.println(str);
		
		
		//개선코드
	System.out.println();
		
	StringBuilder sb = new StringBuilder();
	
	for(int i = 1;i<=100;i++) {
		sb.append(i);
	}
	
	System.out.println(sb);

	}	

}
