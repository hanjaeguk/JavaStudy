package exception;

public class UserExceptionExample {

	public static void main(String[] args) {
		try {
			int i = 0;
			if (i == 0) {
				throw new UserException("i가 0입니다.");
			}
		} catch (UserException ue) {
			System.out.println("userEX");
			System.out.println(ue.getMessage());
			ue.printStackTrace();
		}

	}

}
