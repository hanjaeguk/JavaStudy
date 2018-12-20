package exception_Exercise_Login;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("white","12345");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue","54321");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void login (String id,String password) 
	throws NotExistIDException,WrongPasswordException{
		if(!id.equals("blue")) {
			throw new NotExistIDException("ID가 존재하지 않습니다."); 
		}
		
		if(!password.equals("12345")) {
			throw new NotExistIDException("패스워드가 틀립니다."); 
		}
		
		// throws 안할려면 try catch 써주면됨.
//		try {
//		      if(!id.equals("blue")) {
//		         throw new NotExistIDException("아이디가 존재하지 않습니다.");
//		      }    
//		      } catch (NotExistIDException ne) {
//		         System.out.println(ne.getMessage());   
//		         
//		      
//		      }
//		      
//		      //password가 "12345"가 아니라면 WrongPasswordException 발생시킴
//		      try {
//		      if(!password.equals("12345")) {
//		         throw new WrongPasswordException("패스워드가 틀립니다.");
//		      }
//		      } catch (WrongPasswordException we) {
//		         System.out.println(we.getMessage());
//		      }
//
//		
		
	}

}
