package exception_Exercise_Login;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {}
	public WrongPasswordException(String message){
		super(message);
	}
}
