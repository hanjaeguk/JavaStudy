package exercise;

public class SonataTest {

	public static void main(String[] args) {
		Sonata sonata[] = new Sonata[4];
		sonata[0] = new Sonata("���",5000,"�¿�","NF");
		sonata[1] = new Sonata("����",7000,"����","Brilliant");
		sonata[2] = new Sonata("�����",4000,"�ý�","EF");
		sonata[3] = new Sonata("������",6000,"�¿�","Hybrid");
		
		int len = sonata.length;
		System.out.println("==============================�������==============================");
		for(int i = 0 ; i<len;i++) {
			System.out.println(sonata[i]);
		}
	}
}
