package interface_object;

public interface Stack {
	public abstract int length(); 
	
	public abstract Object pop(); // 삭제(출력) //object 클래스 참조형식,모든 형태를 불러올수 있음.
//	public abstract Object peek(); // 읽기만!
	
	public abstract boolean push(Object ob); //삽입 

}
