package generic;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		
		box.set("Hello World");
		String sbox = box.get();
		System.out.println(sbox);
		
		IBox<String> ibox  = new IBox<String>() {
			private String t;
			@Override
			public String get() {
				// TODO Auto-generated method stub
				return t;
			}

			@Override
			public void set(String t) {
				// TODO Auto-generated method stub
				this.t= t;
			}
			
		};
		
	}

}
