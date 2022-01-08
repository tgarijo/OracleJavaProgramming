package Bank;
import java.util.ArrayList;
import java.util.List;

public class GenericMethodClass {

	public <T> void printArray(T[] array) {
		for ( T arrayItem : array ) {
			System.out.println(arrayItem);
		}
	}
	
	public void printList(List<?> list) {
		for(Object elem: list)
			System.out.println(elem);
		
		System.out.println();
	}
		
	public double sumOfList(ArrayList<? extends Number> arrayList) {
		double s = 0.0;
		for(Number n : arrayList)
			s += n.doubleValue();
		
		return s;
	}
}
