package homework_day9;

import java.util.HashMap;

public class Day9_pro3_StdentExample {

	public static void main(String[] args) {
		// Student 키로 총점을 저장하는 HashMap 객체생성
		HashMap<Student, String> hashMap = new HashMap<Student, String>();

		// new Student("1")의 점수 95 저장
		hashMap.put(new Student("1"), "95");

		// new Student("1")로 좀수를 읽어옴
		String score = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 총점: " + score);
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
