package exception_Exercise_Login;

public class NotExistIDException extends Exception{
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		super(message);
	}

}
