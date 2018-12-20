package generic.ex;

public class Container2Example {

	public static void main(String[] args) {
		Container2<String,String> con1 = new Container2<String,String>();
		con1.set("È«±æµ¿", "µµÀû");
		String name1 = con1.getkey();
		String job = con1.getValue();
		
		System.out.println(name1+","+job);
		
		Container2<String,Integer> con2 = new Container2<String,Integer>();
		con2.set("È«±æµ¿", 35);
		String name2 = con2.getkey();
		int age = con2.getValue();
		
		System.out.println(name2+","+age);
		
	}

}
