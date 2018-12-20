package homework_day1_day5;

public class Day2_pro7 {
	public static void main(String[] args) {
		int num = 12345;
		int sum =0;
		
		for(int i =1; i<=5;i++) {
			sum = num%10+sum;
			num = ((num - num%10)/10);
		}
		
		System.out.println("sum="+sum);
		
	}
}
