package starCraft;

public class StraCraft {

	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		SCV s1 = new SCV();
		SCV s2 = new SCV();
		
		
//		m1.attack(m2);
//		System.out.println("m1 hp:"+m1.hp);
//		System.out.println("m2 hp:"+m2.hp);
//		m1.attack(m2);
//		m1.attack(m2);
//		System.out.println("m1 hp:"+m1.hp);
//		System.out.println("m2 hp:"+m2.hp);
//		m1.attack(m1);
//		System.out.println("m1 hp:"+m1.hp);
//		System.out.println("m2 hp:"+m2.hp);
//		
//		m1.stimpack();
//		m1.attack(m2);
//		System.out.println("m1 hp:"+m1.hp);
//		System.out.println("m2 hp:"+m2.hp);

		
		s1.move(10, 10);
		s1.mind(10,10);
		s1.mind(10, 10);
		
		m1.attack(s1);
		System.out.println("s1����hp:"+s1.hp);
		s1.fix(m1);
		s1.fix(s1);
		s1.fix(s2);
		
		
	}

}
