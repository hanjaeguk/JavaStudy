package conditionLoopFunction;

public class Star {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if((i+j) >= 3) {System.out.print("*");}
				
				else {System.out.print(" ");}		
			}	
			System.out.println();
		}
		
		for(int t = 0; t<3;t++) {
			for(int g =0; g<4;g++) {
				if((t-g)>=0) {System.out.print(" ");}
				
				else {System.out.print("*");}
			}
			System.out.println();
		}
		
	}

}
