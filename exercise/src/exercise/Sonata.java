package exercise;

public class Sonata extends Car{
	private String series; //�ø���
	private String use; //�뵵
	
	public Sonata(String color, int account, String use, String series) {
		super(color, account); //������ ���� �ִ� �÷�, ��ī��Ʈ
		this.use = use;
		this.series = series;
	}

	@Override
	public String toString() {
		return super.toString() + "\t[�뵵] " + use + "\t[�ø���] " + series;
	}
	
	
	
}
