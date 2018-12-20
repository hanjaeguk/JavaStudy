package referenceType;

public class Array {
	public static void main(String[] args) {
//		int[] scores = {83, 90, 87}; // 1
		// 2
		int[] scores;    
		scores = new int[] {83, 90, 87};
		
		//스코어 길이 확인
		System.out.println(scores.length);
		
		int total = 0; 
		//0 1 2
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		
		total = scores[0] + scores[1] + scores[2];
		System.out.println(total);
		
		
		
		
		
	}
}
