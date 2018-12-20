package thread.state.wait;

public class WaitExample {

	public static void main(String[] args) {
		WorkObject wobj = new WorkObject();
		
		ThreadA ta = new ThreadA(wobj);
		ThreadB tb = new ThreadB(wobj);
		
		ta.start();
		tb.start();
	}

}
