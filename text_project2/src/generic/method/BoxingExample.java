package generic.method;

public class BoxingExample {

	public static void main(String[] args) {
//		System.out.println(Util.boxing("Hello World"));
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get(); // Integer -> 자동 언박싱
		
		Box<String> box2 = Util.boxing("Hong");
		String strValue = box2.get(); // String = String 넣기
		
		Box<String> box3 = new Box<String>();
		Box<String> box4 = new Box<>();
	}

}
