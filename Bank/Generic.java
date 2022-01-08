package Bank;

public class Generic<T> {
	
	private T data;
	
	public void setValue(T celldata) {
		data=celldata;
	}
	public T getValue() {
		return data;
	}
	
	
}

