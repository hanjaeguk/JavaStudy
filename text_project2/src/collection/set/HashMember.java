package collection.set;

import java.util.HashSet;

public class HashMember {

	public static void main(String[] args) {
		HashSet<Member> set = new HashSet<>();
		Member a = new Member("hong",30);
		Member b = new Member("hong",30);
		
		System.out.println(a.equals(b));
		set.add(a);
		set.add(b);
		
		System.out.println(set.size());
	}

}

class Member {
	public String name;
	public int age;

	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member m = (Member) obj;
			return m.name.equals(name) && (m.age == age);
		} else {

			return false;
		}

	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

}
