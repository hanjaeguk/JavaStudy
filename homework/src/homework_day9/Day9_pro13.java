package homework_day9;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Day9_pro13 {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sd.format(now));
	}

}
