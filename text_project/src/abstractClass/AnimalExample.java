package abstractClass;

public class AnimalExample {

	public static void main(String[] args) {
		//1
		Cat cat  = new Cat();
		Dog dog = new Dog();
		
		//2
		Animal animal = null;//�پ缺 animal �ּҰ� �� �����ͼ� null�� ����
		animal = new Cat();
		animal.Breathe();
		animal.sound();
		animal = new Dog();
		animal.Breathe();
		animal.sound();
//		Animal animal = new Animal; // �̰� �ȵ�
		
		//3 ���常 ���������ϴ¹�
		animalSound(new Cat());
		animalSound(new Dog());
		
	}
	public static void animalSound(Animal animal) { // �Լ� �ϳ� ����
		animal.sound();
	}

}
