package homework_day6;

public class Day6_pro1 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		return Math.round(((float)(kor+eng+math)/3)*10f)/10f;
	}
	
	
}
