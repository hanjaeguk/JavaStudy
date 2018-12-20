package exception;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			String data = null;
			System.out.println(data.toString()); // 널포인트 익셉션 발생하는 캐치로 고			
		}catch(Exception a) { // 무조건 예외 발생하면
			System.out.println("Exception 발생");
		}finally { // 캐치를 하던 안하던 무조건 동작(부가적인 옵션)
			System.out.println("파이널!!");
		}


	}

}
