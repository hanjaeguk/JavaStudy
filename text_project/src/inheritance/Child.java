package inheritance;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name,int studentNo) {
		super(name); // 부모클래스에 있는 생성사를 넣어줘야함, super 는 parent를 의미
		this.studentNo = studentNo;
	}
	

}
