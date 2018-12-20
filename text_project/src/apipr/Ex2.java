package apipr;

public class Ex2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java "); // 문자열 끝에 추가
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, "2"); // 4번재 문자뒤에 2삽입
		System.out.println(sb.toString());
		
		sb.setCharAt(4,'6'); // 4번째 문자 뒤의 문자를 6으로 변경
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book"); // 6번째 문자 뒤부터 13번째 문자까지를 "Book"로 대치
		System.out.println(sb.toString());
		
		sb.delete(4, 5); // 5번째 문자를 삭제
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총문자수:"+length);
		
		String result = sb.toString(); //버퍼에 있는것을 String타입으로 리턴
		System.out.println(result);
		
		
		
		
	}

}
