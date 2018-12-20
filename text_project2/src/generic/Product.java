package generic;

public class Product <K,M>{
	private K kind;
	private M model;
	
	public K getKind() {
		return this.kind;
	}
	
	public void setKing(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return this.model;
	}
	
	public void setModel(M model) {
		this.model = model;
	}

}

class Car {
	String kind = "EU";
}

