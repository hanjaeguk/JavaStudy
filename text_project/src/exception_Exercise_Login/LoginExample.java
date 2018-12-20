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
			throw new NotExistIDException("ID�� �������� �ʽ��ϴ�."); 
		}
		
		if(!password.equals("12345")) {
			throw new NotExistIDException("�н����尡 Ʋ���ϴ�."); 
		}
		
		// throws ���ҷ��� try catch ���ָ��.
//		try {
//		      if(!id.equals("blue")) {
//		         throw new NotExistIDException("���̵� �������� �ʽ��ϴ�.");
//		      }    
//		      } catch (NotExistIDException ne) {
//		         System.out.println(ne.getMessage());   
//		         
//		      
//		      }
//		      
//		      //password�� "12345"�� �ƴ϶�� WrongPasswordException �߻���Ŵ
//		      try {
//		      if(!password.equals("12345")) {
//		         throw new WrongPasswordException("�н����尡 Ʋ���ϴ�.");
//		      }
//		      } catch (WrongPasswordException we) {
//		         System.out.println(we.getMessage());
//		      }
//
//		
		
	}

}
