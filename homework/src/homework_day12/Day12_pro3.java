package homework_day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Day12_pro3 {
	static int getGroupCount(TreeSet test, int from, int to) {
		// 1
		return 0;
	}

	public static void main(String[] args) {
		TreeSet set = new TreeSet(new Comparator() {
			public int compare(Object o1, Object o2) {
				// 2
				return 0;
			}
		});

		set.add(new Student2("ȫ�浿", 1, 1, 100, 100, 100));
		set.add(new Student2("������", 1, 2, 90, 70, 80));
		set.add(new Student2("���ڹ�", 1, 3, 80, 80, 90));
		set.add(new Student2("���ڹ�", 1, 4, 70, 90, 70));
		set.add(new Student2("���ڹ�", 1, 5, 60, 100, 83));

		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
		System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
		System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
		System.out.println("[90~100] :" + getGroupCount(set, 90, 101));
	}

}

class Student2 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}

	@Override
	public int compareTo(Object obj) {
		if (obj instanceof Student2) {
			Student2 st = (Student2) obj;
			return name.compareTo(st.name);
		} else {
			return -2;
		}
	}
}
