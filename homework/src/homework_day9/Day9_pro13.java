package homework_day9;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Day9_pro13 {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		System.out.println(sd.format(now));
	}

}
