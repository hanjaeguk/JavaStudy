package inheritance;

public class SonataExample{

	public static void main(String[] args) {
		Sonata sonata = new Sonata();
		sonata.color="���";
		sonata.drive();
		
		System.out.println(sonata.color);
		
		Lexus lexus = new Lexus();
		lexus.color="������";
		lexus.drive();
		lexus.driveBack();
		
		System.out.println(lexus.color);
		
	}
}
