package inheritance;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name,int studentNo) {
		super(name); // �θ�Ŭ������ �ִ� �����縦 �־������, super �� parent�� �ǹ�
		this.studentNo = studentNo;
	}
	

}
