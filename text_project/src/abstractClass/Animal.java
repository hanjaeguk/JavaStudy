package abstractClass;

public abstract class Animal {
	public String kind;
	
	public void Breathe() {
		System.out.println("숨을쉰다");
	}
	
	public abstract void sound(); // 사운드는 너네가 만들어라!! 자식 클래스에서 안만들면 에러가 뜸

}
