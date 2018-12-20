package abstractClass;

public class AnimalExample {

	public static void main(String[] args) {
		//1
		Cat cat  = new Cat();
		Dog dog = new Dog();
		
		//2
		Animal animal = null;//다양성 animal 주소값 다 가져와서 null에 저장
		animal = new Cat();
		animal.Breathe();
		animal.sound();
		animal = new Dog();
		animal.Breathe();
		animal.sound();
//		Animal animal = new Animal; // 이건 안됨
		
		//3 사운드만 가져오게하는법
		animalSound(new Cat());
		animalSound(new Dog());
		
	}
	public static void animalSound(Animal animal) { // 함수 하나 생성
		animal.sound();
	}

}
