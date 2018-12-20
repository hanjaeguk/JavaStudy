package inheritance;

public class SonataExample{

	public static void main(String[] args) {
		Sonata sonata = new Sonata();
		sonata.color="흰색";
		sonata.drive();
		
		System.out.println(sonata.color);
		
		Lexus lexus = new Lexus();
		lexus.color="검은색";
		lexus.drive();
		lexus.driveBack();
		
		System.out.println(lexus.color);
		
	}
}
