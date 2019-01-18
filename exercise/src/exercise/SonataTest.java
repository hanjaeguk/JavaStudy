package exercise;

public class SonataTest {

	public static void main(String[] args) {
		Sonata sonata[] = new Sonata[4];
		sonata[0] = new Sonata("흰색",5000,"승용","NF");
		sonata[1] = new Sonata("은색",7000,"업무","Brilliant");
		sonata[2] = new Sonata("감흥색",4000,"택시","EF");
		sonata[3] = new Sonata("검정색",6000,"승용","Hybrid");
		
		int len = sonata.length;
		System.out.println("==============================생산시작==============================");
		for(int i = 0 ; i<len;i++) {
			System.out.println(sonata[i]);
		}
	}
}
