package thread.sync;

public class User1 extends Thread{
	private Calculator calc;
	
	public void setCalc(Calculator calc) {
		this.setName("User1-thread");
		this.calc = calc;
	}
	@Override
	public void run() {
		calc.set(50);
	}

}

class User2 extends Thread{
	private Calculator calc;
	
	public void setCalc(Calculator calc) {
		this.setName("User2-thread");
		this.calc = calc;
	}
	@Override
	public void run() {
		calc.set(100);
	}

}