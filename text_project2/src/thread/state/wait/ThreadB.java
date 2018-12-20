package thread.state.wait;

public class ThreadB extends Thread{
	WorkObject wo;

	public ThreadB(WorkObject wo) {
		this.wo = wo;
	}

	public void run() {
		for(int i = 0 ; i<10; i++) {
			wo.methodA();
		}
	}

}
