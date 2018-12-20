package exception;

public class MultiTryCatchFinally {

	public static void main(String[] args) {
		try {
			
			String data = null;
			System.out.println(data.toString()); // 1	
			
			String data2 = "a200";
			int value2 =Integer.parseInt(data2);
			
			Dog dog = new Dog();
			Cat cat = new Cat();
			
			dog = (Dog) new Animal(); // 강제형변환
			
		}catch(NullPointerException | NumberFormatException e1) { // 2
			System.out.println("NullPointerException 또는 NumberFormatException 발생");
		}
//		catch(NumberFormatException e2) {
//			System.out.println("NumberFormatException 발생");
//			}
		catch(ClassCastException e3) {
			System.out.println("ClassCastException 발생");
		}catch(Exception e0) { // 가장포괄적인것을 제일 뒤에 두면 에러 발생 안함. 앞에두면 에러 발생
			System.out.println("Exception 발생");
		}
		
		finally { 
			System.out.println("파이널!!");
		}

	}

}
