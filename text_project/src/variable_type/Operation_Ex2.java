package variable_type;

public class Operation_Ex2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x= 10;
		y= 10;
				
		System.out.println("--------------------");
		x++; // x=x+1
		System.out.println(x);
		++x; // x=1+x
		System.out.println(x);
		
		System.out.println("x="+x);
		
		System.out.println(x++); // 끝나고
		System.out.println(++x); // 끝나기 전에  
		
		
		x= 10;
		y= 10;
		System.out.println("--------------------");
		y--;
		--y;
		System.out.println("y="+y);
		
		
		x= 10;
		y= 10;
		System.out.println("--------------------");
		z = x++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		
		x= 10;
		y= 10;
		System.out.println("--------------------");
		z = ++x;
		System.out.println("z="+z);
		System.out.println("x="+x);
	
		
		x= 10;
		y= 10;
		System.out.println("--------------------");
		z = ++x + y++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		
		x= 10;
		y= 10;
		z= x++ + y++; // 끝나고 플러스
		System.out.println(z); // 시점! x=11,y=11
		
		
		System.out.println("--------------------");
		x = 11;
		y = 13; 
		
		++x; //x=1+11 = 12
		System.out.println(x++); // 12를 출력하고 x값이 13으로 바뀌는것
		System.out.println(--x); // 12 //13-1, x=12 ,13에서 1을 빼고 출력 x값이 12
		System.out.println(--x); // 11 // 12-1, x=11,12에서 1을 빼고 출력 x값이 11
 
		x++; //x=11+1 = 12
		System.out.println(x++); // 12를 출력하고 x값이 13으로 바뀌는것		
	}

}













