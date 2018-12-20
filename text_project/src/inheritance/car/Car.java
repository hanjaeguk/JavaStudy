package inheritance.car;

public class Car {
//	Tire f_L_Tire = new Tire("Front Left",10);
//	Tire f_R_Tire = new Tire("Front Right",20);
//	Tire B_L_Tire = new Tire("Back Left",30);
//	Tire B_R_Tire = new Tire("Back Right",40);

	Tire f_L_Tire = new Han_Tire("Front Left");
	Tire f_R_Tire = new Han_Tire("Front Right");
	Tire B_L_Tire = new Kum_Tire("Back Left");
	Tire B_R_Tire = new Kum_Tire("Back Right");

	Tire[] tire = { 
			new Han_Tire("Front Left"), 
			new Han_Tire("Front Right"), 
			new Kum_Tire("Back Left"),
			new Kum_Tire("Back Right"), };

	void run() {
		System.out.println("[자동차가 달립니다.]");
		for(int i=0;i<4;i++) {
			tire[i].roll();
			if(tire[i].accumulateRotaion==tire[i].maxRotation) {
				this.stop();
				System.out.println("멈췄다");
				break;
			}
		}
//		f_L_Tire.roll();
//		f_R_Tire.roll();
//		B_L_Tire.roll();
//		B_R_Tire.roll();
	}

	void stop() {

	}

}
