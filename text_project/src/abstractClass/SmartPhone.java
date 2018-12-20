package abstractClass;

public class SmartPhone extends Phone{ //폰에서 완성 완된걸 자식클래스에서 해결 해야함
	//생성자
	SmartPhone(String owner){
		super(owner);
	}
	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷검색");
	}
	
	@Override
	public void call() {
		System.out.println("call");
	}
	
}
