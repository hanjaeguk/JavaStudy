package exercise;

public class Day1_Ex_04 {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		//학생 한명이 가지는 연필수
		int pencilsPerStudent = 534/30;
		System.out.println(pencilsPerStudent);
		
		//남은 연필수
		int pencilsLeft = 534%30;
		System.out.println(pencilsLeft);
		
		
	}
}
