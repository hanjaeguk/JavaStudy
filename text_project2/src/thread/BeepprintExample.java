package thread;

public class BeepprintExample {

	public static void main(String[] args) {

//		 ������ ����
//		#1
//		Runnable bt = new BeepTask();
//		Thread bt2 = new Thread(bt);
//		bt2.start();
		
//		#2
//		Thread bt2 = new Thread(bt);
//		bt2.start();

//		===============
//		for (int i = 0; i < 5; i++) {
//			System.out.println("�۾�~");
//
//			try {
//				Thread.sleep(500); // 0.5��
//			} catch (Exception e) {
//
//			}
//		}

		// �͸�ü(�ѹ��� ����) #3
		Thread bt2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("��~");

					try {
						Thread.sleep(300); // 0.5��
					} catch (Exception e) {

					}
				}
			}

		});
		bt2.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("�۾�~");

			try {
				Thread.sleep(500); // 0.5��
			} catch (Exception e) {

			}
		}

	}

}

class BeepTask implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("��~");

			try {
				Thread.sleep(300); // 0.5��
			} catch (Exception e) {

			}
		}
	}

}

class BeepTask2 extends Thread {
	@Override
	public void run() {

	}
}
