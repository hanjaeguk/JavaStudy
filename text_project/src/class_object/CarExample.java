package class_object;

public class CarExample {

	public static void main(String[] args) {
		Car mycar = new Car("제네시스");
		System.out.println(mycar.company);
		System.out.println(mycar.model);
		System.out.println(mycar.color);
		System.out.println(mycar.maxSpeed);
		mycar.maxSpeed=300;
		System.out.println("최고속도변경:"+mycar.maxSpeed);
		
		Car sCar = new Car("BMW","S시리즈");
		System.out.println(sCar.company);
		System.out.println(sCar.model);
		System.out.println(sCar.color);
		System.out.println(sCar.maxSpeed);
				
		
		
	}

}


//따로 파일을 만들어도 되지만 한 파일 안에서 아래와 같이 추가해도됨
class Car{
	//필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	Car(String _model){
		model=_model;
	}
	
	Car(String _company,String _model){
		company = _company;
		model=_model;
	}
	
	
	//Car(){}; //생성자 안적어도 만듬
	
	
}
