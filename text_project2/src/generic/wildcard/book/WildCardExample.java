package generic.wildcard.book;

import java.util.Arrays;

public class WildCardExample {
	// 모든과정
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	// 학생과정
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	// 직장인과 일반인 과정
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));

		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));

		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		studentCourse.add(new Student("학생"));

		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
		highStudentCourse.add(new HighStudent("고등학생"));

		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);

		System.out.println();

//		registerCourseStudent(personCourse);
//		registerCourseStudent(workerCourse);
		// 학생과정만 등록가능
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);

		// 직장인과 일반인 과정만 등록가능
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