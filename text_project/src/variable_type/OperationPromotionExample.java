package variable_type;

public class OperationPromotionExample {
	public static void main(String[] args) {
		byte byteValte1 = 10;
		byte byteValte2 = 20;
		//byte byteValte3 = byteValte1 + byteValte2; // 컴퍼일 에러
		int intValue1 = byteValte1 + byteValte2;
		System.out.println(intValue1);
		
		char charValue1 = 'A'; // charValue = 65
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2; // 컴파일 에러
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드="+intValue2);
		System.out.println("출력문자="+(char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0; // 컴파일 에러
		//int intValue6 = 10 / 4; //이렇게는 됨
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		//sysout 치고 컨트롤+스페이스바 치면 프린트
	}
}
