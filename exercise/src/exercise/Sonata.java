package exercise;

public class Sonata extends Car{
	private String series; //시리즈
	private String use; //용도
	
	public Sonata(String color, int account, String use, String series) {
		super(color, account); //상위가 갖고 있는 컬러, 어카운트
		this.use = use;
		this.series = series;
	}

	@Override
	public String toString() {
		return super.toString() + "\t[용도] " + use + "\t[시리즈] " + series;
	}
	
	
	
}
