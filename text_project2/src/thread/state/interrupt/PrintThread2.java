package thread.state.interrupt;

public class PrintThread2 extends Thread {
	public void run() {
		try {
			while (true) {
				System.out.println("Process");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupt 동작");
		}
		System.out.println("실행종료");
	}
}
