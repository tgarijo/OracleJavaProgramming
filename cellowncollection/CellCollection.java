package cellowncollection;

public class CellCollection<T> {

	T[] cells;
	int index=0;
	
	@SuppressWarnings("unchecked")
	public CellCollection(int size) {
		cells = (T[]) new Object[size];
	}
	
	public void add(T c) {
		cells[index]=c;
		index++;
	}
	
	public T  get(int i) {
		return cells[i];
	}
	
	public String toString() {
		
		String data="";
		for (T  cell : cells) {
			if(cell != null)
				data += cell+" ";
		}
		
		return data;
	}

	
}
