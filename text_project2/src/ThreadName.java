
public class ThreadName {

	public static void main(String[] args) {
		Thread ta = new ThreadA();
		ta.setName("ThreadA - 01");
		ta.setPriority(Thread.MAX_PRIORITY);
		ta.start();
		System.out.println(ta.getName());

		Thread tb = new ThreadB();
		tb.setName("ThreadB - 01");
		tb.setPriority(Thread.MIN_PRIORITY);
		tb.start();
		System.out.println(tb.getName());
		
		Thread tc = new ThreadC();
		tc.setName("ThreadC - 01");
		tc.setPriority(Thread.NORM_PRIORITY);
		tc.start();
		System.out.println(tc.getName());

	}

}

class ThreadA extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(this.getName());
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadB extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(this.getName());
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadC extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(this.getName());
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}