package exercise;

public class Car {
	private String color; // 색상
	private int account; // 생산수량
	
	public Car(String color, int account) {
		this.color = color;
		this.account = account;
	}
	
    @Override
    public String toString() {
        return "[색상] " + color + "\t[생산수량] " + account;
    }



}
