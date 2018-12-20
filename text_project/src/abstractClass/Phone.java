package abstractClass;

public abstract class Phone { // �߻�Ŭ����
	// �ʵ�
	String owner;

	// ������
	Phone(String _owner) {
		this.owner = _owner;
	}

	// �޼���
	void turnOn() {
		System.out.println("ON!!");

	}

	void turnOff() {
		System.out.println("OFF!!");

	}

	public abstract void call(); // abstract�� �ִ� �������� abstractŬ���������� �������� public�� ����

}
