package thread.state.yield;

public class YieldExample {

	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		
		a.start();
		b.start();
	
		try {Thread.sleep(3000);} catch(Exception e) { e.printStackTrace();}
		a.work = false;
		
		try {Thread.sleep(3000);} catch(Exception e) { e.printStackTrace();}
		a.work = true;
		
		try {Thread.sleep(3000);} catch(Exception e) { e.printStackTrace();}
		a.stop = true;
		
		try {Thread.sleep(3000);} catch(Exception e) { e.printStackTrace();}
		a.stop = true;
		b.stop = true;
	}

}
