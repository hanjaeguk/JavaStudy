package class_object;

public class AsuradaExample {

	public static void main(String[] args) {
		Asurada asu = new Asurada("han");
		asu.PowerOn("han");
		asu.transfer("D");
		asu.run();
		asu.run();
		asu.run();
		asu.run();		
		asu.run();		
		asu.run();		
		asu.run();		
		asu.run();		
		asu.run();		
		asu.run();		
		asu.run();		
		asu.run();		
		asu.transfer("S");
		asu.stop();
		asu.stop();
		asu.stop();
		asu.transfer("D");
		asu.run();		
		asu.transfer("B");
		asu.booster();
		
//		asu.PowerOff("han");
//		
//		Asurada enemy = new Asurada("aoi");
//		enemy.PowerOn("aoi");
//		enemy.PowerOff("aoi");
		

	}

}
