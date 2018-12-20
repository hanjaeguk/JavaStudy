package thread.state.join;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sum = new SumThread();
		sum.start();
		
		try {
			sum.join(); // 10�� ����ͼ� �շ��� �Ҷ����� ���߰� �ϴ°� �Ⱦ��� start������ 0�̶�
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(sum.sum);
	}

}
