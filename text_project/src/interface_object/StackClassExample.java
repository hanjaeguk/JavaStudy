package interface_object;

public class StackClassExample {

	public static void main(String[] args) {
		StackClass st = new StackClass();
		st.push('A');
		st.push('B');
		System.out.println(st.save[0]);
		System.out.println(st.save[1]);
		System.out.println(st.length());
		st.push('C');
		System.out.println(st.length());
		st.pop();
		st.pop();
		st.pop();
		
//		Stack stack = new Stack(){ // 익명구현 객체(한번쓰고 버릴꺼)
//			Object[] save = new Object[5];
//			int i = 0;
//			
//			@Override
//			public Object peek() {
//			Object result = save[--i];
//			save[i] = null;
//			return result;
//			}
//		};
		
		
	}

}
