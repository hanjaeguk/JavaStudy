package class_object;

public class Pro13_member {
	public static void main(String[] args) {
		Member user1 = new Member("ȫ�浿","Hong");
		System.out.println(user1.name);
		System.out.println(user1.id);
	}
}

class Member{
	String name;
	String id;
	String password;
	int age;
	
	//������ ����
	Member(String _name,String _id){
		name = _name;
		id = _id;
	}
	
}

