package homework_day6;

public class Day6_pro2 {
	// 메소드 작성
	static int max(int[] arr) {
		int temp = 0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length-1;j++) {
//				if(arr[j] < arr[j+1]) {
//					temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//			
//		}

		int i = 0;
		int j = 0;
		if (arr != null && arr.length != 0) {
			while (i < arr.length) {
				j = 0;
				while (j < arr.length - 1) {
					if (arr[j] < arr[j + 1]) {
						temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
					j++;
				}
				i++;
			}
		}else if(arr == null || arr.length == 0) {
			return -999999;
		}
		return arr[0];

	}

	static int abs(int value) {
		return Math.abs(value);
	}

	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크거가 0인 배열
		int value = 5;
		System.out.println(value + "의절대값:" + abs(value));
		value = 10;
		System.out.println(value + "의절대값:" + abs(value));

	}

}
