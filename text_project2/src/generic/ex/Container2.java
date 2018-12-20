package generic.ex;

public class Container2 <T,M>{
	private T t;
	private M m;
	public T getkey() {
		return t;
	}
	public void set(T t,M m) {
		this.t = t;
		this.m = m;
	}
	
	public M getValue() {
		return m;
	}
	
	
}
