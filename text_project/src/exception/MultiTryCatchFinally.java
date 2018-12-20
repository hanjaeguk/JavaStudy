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
			
			dog = (Dog) new Animal(); // ��������ȯ
			
		}catch(NullPointerException | NumberFormatException e1) { // 2
			System.out.println("NullPointerException �Ǵ� NumberFormatException �߻�");
		}
//		catch(NumberFormatException e2) {
//			System.out.println("NumberFormatException �߻�");
//			}
		catch(ClassCastException e3) {
			System.out.println("ClassCastException �߻�");
		}catch(Exception e0) { // �����������ΰ��� ���� �ڿ� �θ� ���� �߻� ����. �տ��θ� ���� �߻�
			System.out.println("Exception �߻�");
		}
		
		finally { 
			System.out.println("���̳�!!");
		}

	}

}
