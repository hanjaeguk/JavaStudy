package thread.sync;

public class Calculator {
	private int memory;

	public int get() {
		return memory;
	}
	// synchronized �̻��� user1 �� 50 user2 100�� ���� 100�� ���
	// ���� user1 50�� 2�� ���� ���� user2 100�� ����� ���
	// �̻��� 2�� ���� 4�� -> public synchronized void set(int memory) �޼ҵ� ��ü�� ��ũ�� �ɱ�

	public void set(int memory) {
		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//		} // ������� ��ũ�� ����! ���� ���� �߻�
			System.out.println(Thread.currentThread().getName() + " " + this.memory);
		} // ������� ��ũ�� ����! ���� �߻�����
	}

}
