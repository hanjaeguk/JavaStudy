package thread.state.wait;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("methodA 실행");
		notify();
		try {
			this.wait();
		}catch(InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("methodB 실행");
		notify();
		try {
			this.wait();
		}catch(InterruptedException e) {}
	}


}
