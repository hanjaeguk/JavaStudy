package homework_day9;

public class Day9_pro4 {

	public static void main(String[] args) {
		Member m = new Member("blue", "ÀÌÆÄ¶õ");
		System.out.println(m);
	}

}

class Member {
	private String id;
	private String name;

	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}