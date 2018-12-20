package exception;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String data = "100";
		String data2 = "200";

		int value1 =Integer.parseInt(data);
		int value2 =Integer.parseInt(data2);
		
		int result = value1+value2;
		System.out.println(data+"+"+data2+"="+result);
	}

}
