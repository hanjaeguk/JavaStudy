package thread.state.wait;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("methodA ����");
		notify();
		try {
			this.wait();
		}catch(InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("methodB ����");
		notify();
		try {
			this.wait();
		}catch(InterruptedException e) {}
	}


}
