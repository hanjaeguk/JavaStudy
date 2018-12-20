package class_object;

public class MemberServiveExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberServive ms = new MemberServive();
		boolean result = ms.login("hong", "12345");
		if(result) {
			System.out.println("login 완료");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
	}
	
}

class MemberServive{
	String id;
	String password;
	
	boolean login(String _id,String _password) {
		boolean result = false;
		if(id=="hong"&&password=="12345") {
			result = true;
		}
		return result;
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다");
	}
	
}

