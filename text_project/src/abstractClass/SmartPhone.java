package abstractClass;

public class SmartPhone extends Phone{ //������ �ϼ� �ϵȰ� �ڽ�Ŭ�������� �ذ� �ؾ���
	//������
	SmartPhone(String owner){
		super(owner);
	}
	
	//�޼ҵ�
	public void internetSearch() {
		System.out.println("���ͳݰ˻�");
	}
	
	@Override
	public void call() {
		System.out.println("call");
	}
	
}
