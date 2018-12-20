package thread.state.join;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sum = new SumThread();
		sum.start();
		
		try {
			sum.join(); // 10번 돌고와서 합류를 할때까지 멈추게 하는거 안쓰면 start했을때 0이뜸
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(sum.sum);
	}

}
