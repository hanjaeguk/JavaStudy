package nestedclassInterface.ex;

public class Anonymous { // �������̽� Vehicle ��� ���ϰ� �͸�ü�� �������� {} �ȿ� �������̽� ����
						//implements �� ����ϴ¹� �͸�ü�� �Ʒ��Ͱ��� ���̷�Ʈ�� �ϴ¹� �ΰ���������.
	Vehicle field = new Vehicle() {

		@Override
		public void run() {
			System.out.println("�ڵ����� �޸��ϴ�.");
		}
	};

	void method() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("�¿����� �޸��ϴ�.");
			}
		};
		localVar.run();
	}

	void method2(Vehicle v) {
		v.run();
	}
}