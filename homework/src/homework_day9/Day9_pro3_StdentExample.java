package homework_day9;

import java.util.HashMap;

public class Day9_pro3_StdentExample {

	public static void main(String[] args) {
		// Student Ű�� ������ �����ϴ� HashMap ��ü����
		HashMap<Student, String> hashMap = new HashMap<Student, String>();

		// new Student("1")�� ���� 95 ����
		hashMap.put(new Student("1"), "95");

		// new Student("1")�� ������ �о��
		String score = hashMap.get(new Student("1"));
		System.out.println("1�� �л��� ����: " + score);
	}

}

class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public boolean equals(Object ob) {
		if (ob instanceof Student) {
			Student st = (Student) ob;
			if (studentNum.equals(st.studentNum)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}

}
