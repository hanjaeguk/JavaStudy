package exception;

public class UserExceptionExample {

	public static void main(String[] args) {
		try {
			int i = 0;
			if (i == 0) {
				throw new UserException("i�� 0�Դϴ�.");
			}
		} catch (UserException ue) {
			System.out.println("userEX");
			System.out.println(ue.getMessage());
			ue.printStackTrace();
		}

	}

}
