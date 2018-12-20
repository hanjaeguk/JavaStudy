package referenceType;

public class ArrayCopyFunc {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] dest = new int[6];
		
		System.arraycopy(arr, 0, dest, 0, arr.length);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(dest[i]);
		}
	}
}
