package exception;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			String data = null;
			System.out.println(data.toString()); // ������Ʈ �ͼ��� �߻��ϴ� ĳġ�� ��			
		}catch(Exception a) { // ������ ���� �߻��ϸ�
			System.out.println("Exception �߻�");
		}finally { // ĳġ�� �ϴ� ���ϴ� ������ ����(�ΰ����� �ɼ�)
			System.out.println("���̳�!!");
		}


	}

}
