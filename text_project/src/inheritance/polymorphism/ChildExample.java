package inheritance.polymorphism;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent2 = new Parent();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
//		parent.method3(); // ũ�Ⱑ �ٸ��⶧���� ������� ������ ����
		
		if(parent instanceof Child) { //���� ���� ���� ��ü
		Child child2 = (Child)parent; // ��������ȯ
		child2.method1();
		child2.method2();
		child2.method3();
		}
	}
}
