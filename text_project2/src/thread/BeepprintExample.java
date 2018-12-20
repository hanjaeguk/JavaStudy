package thread;

public class BeepprintExample {

	public static void main(String[] args) {

//		 여러번 쓰기
//		#1
//		Runnable bt = new BeepTask();
//		Thread bt2 = new Thread(bt);
//		bt2.start();
		
//		#2
//		Thread bt2 = new Thread(bt);
//		bt2.start();

//		===============
//		for (int i = 0; i < 5; i++) {
//			System.out.println("퍼엉~");
//
//			try {
//				Thread.sleep(500); // 0.5초
//			} catch (Exception e) {
//
//			}
//		}

		// 익명개체(한번만 쓰기) #3
		Thread bt2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("펑~");

					try {
						Thread.sleep(300); // 0.5초
					} catch (Exception e) {

					}
				}
			}

		});
		bt2.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("퍼엉~");

			try {
				Thread.sleep(500); // 0.5초
			} catch (Exception e) {

			}
		}

	}

}

class BeepTask implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("펑~");

			try {
				Thread.sleep(300); // 0.5초
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
