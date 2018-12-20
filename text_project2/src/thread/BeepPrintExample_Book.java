package thread;

import java.awt.Toolkit;

public class BeepPrintExample_Book {

	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("¶¥~!");
			try {Thread.sleep(500);
			}catch(Exception e) {
				
			}
			
		}
	}

}

class BeepThread extends Thread{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			}catch(Exception e){
				
			}
		}
	}
}
