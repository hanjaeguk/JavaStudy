package thread.state.wait;

public class ThreadA extends Thread{
	WorkObject wo;

	public ThreadA(WorkObject wo) {
		this.wo = wo;
	}

	public void run() {
		for(int i = 0 ; i<10; i++) {
			wo.methodB();
		}
	}
}
