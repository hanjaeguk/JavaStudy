package exception;

public class TheowException {

	public static void main(String[] args) {
		try {
		aMethod();
		bMethod();
		}catch(Exception e) {
			System.out.println("main:exception");
		}
		
	}
	
	public static void aMethod() throws Exception{
	
		String data = null;
		System.out.println(data.toString());
	
	}
	
	public static void bMethod() throws Exception{
		
		String data = null;
		System.out.println(data.toString());
	
	}

}
