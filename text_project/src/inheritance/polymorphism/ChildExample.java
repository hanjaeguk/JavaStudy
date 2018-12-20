package inheritance.polymorphism;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent2 = new Parent();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
//		parent.method3(); // 크기가 다르기때문에 여기까지 보지를 못함
		
		if(parent instanceof Child) { //현재 변수 이전 객체
		Child child2 = (Child)parent; // 강제형변환
		child2.method1();
		child2.method2();
		child2.method3();
		}
	}
}
