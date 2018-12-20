package interface_object;

public class StackClass  implements Stack{
	Object[] save = new Object[5];
//	char[] arr = new char[5];
	int i = 0;
	@Override
	public int length() {
		int cnt=0;
		for(int i =0;i<save.length;i++) {
			if (save[i] != null) {
				cnt++;
			}
		}
		return cnt;
	}

	@Override
	public Object pop() {
		Object result = save[i--];
		save[i] = null;
		
		return result;
	}

	@Override
	public boolean push(Object ob) {
		save[i] = ob;
		i++;
		return true;
	}
}
