package thread.sync;

public class Calculator {
	private int memory;

	public int get() {
		return memory;
	}
	// synchronized 미사용시 user1 이 50 user2 100이 들어가서 100이 출력
	// 사용시 user1 50이 2초 점유 동안 user2 100은 대기후 출력
	// 미사용시 2초 사용시 4초 -> public synchronized void set(int memory) 메소드 전체에 싱크로 걸기

	public void set(int memory) {
		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//		} // 여기까지 싱크로 막기! 같은 문제 발생
			System.out.println(Thread.currentThread().getName() + " " + this.memory);
		} // 여기까지 싱크로 막기! 문제 발생안함
	}

}
