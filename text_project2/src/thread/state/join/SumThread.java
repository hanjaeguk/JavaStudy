package thread.state.join;

public class SumThread extends Thread{
	int sum;
	
	public void run() {
		for(int i = 1; i<11;i++) {
			sum += i;
		}
	}
}
