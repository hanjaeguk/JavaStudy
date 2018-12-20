package exception;

public class UserException extends RuntimeException{
	UserException(){}
	
	UserException(String meg){
		super(meg);
	}

}
