package generic.wildcard.book;

import java.util.Arrays;

public class WildCardExample {
	// ������
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
	}

	// �л�����
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
	}

	// �����ΰ� �Ϲ��� ����
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("�Ϲ��ΰ���", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));

		Course<Worker> workerCourse = new Course<Worker>("�����ΰ���", 5);
		workerCourse.add(new Worker("������"));

		Course<Student> studentCourse = new Course<Student>("�л�����", 5);
		studentCourse.add(new Student("�л�"));

		Course<HighStudent> highStudentCourse = new Course<HighStudent>("����л�����", 5);
		highStudentCourse.add(new HighStudent("����л�"));

		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);

		System.out.println();

//		registerCourseStudent(personCourse);
//		registerCourseStudent(workerCourse);
		// �л������� ��ϰ���
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);

		// �����ΰ� �Ϲ��� ������ ��ϰ���
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
//		registerCourseWorker(studentCourse);
//		registerCourseWorker(highStudentCourse);

	}

}

class Person {
	String type;

	Person(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return type;
	}
}

class Worker extends Person {

	Worker(String type) {
		super(type);
	}
}

class Student extends Person {

	Student(String type) {
		super(type);

	}
}

class HighStudent extends Student {

	HighStudent(String type) {
		super(type);

	}
}

class Course<T> {
	private String name;
	private T[] students;

	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]);
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}

	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}