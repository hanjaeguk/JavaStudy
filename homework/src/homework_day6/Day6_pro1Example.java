package homework_day6;

public class Day6_pro1Example {

	public static void main(String[] args) {
		Day6_pro1 s = new Day6_pro1();
		
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("�̸�:"+s.name);
		System.out.println("����:"+s.getTotal());
		System.out.println("���:"+s.getAverage());
	}

}
