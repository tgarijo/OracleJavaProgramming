package Bank;
import java.util.ArrayList;

public class GenericMethodDriver {

	public static void main(String[] args) {
		GenericMethodClass gmc = new GenericMethodClass();
		
		Integer[] integerArray = {1,2,3};
		String[] stringArray = {"this", "is", "fun"};
		
		gmc.printArray(integerArray);
		gmc.printArray(stringArray);
		
		ArrayList<Double> array1 = new ArrayList<Double>();
		array1.add(25.5);
		array1.add(34.9);
		array1.add(45.7);
		gmc.printList(array1);
		
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		array2.add(10);
		array2.add(20);
		array2.add(30);
		gmc.printList(array2);

		System.out.println(gmc.sumOfList(array1));
		System.out.println((int) gmc.sumOfList(array1));
		
		/*
		ArrayList<String> sArray = new ArrayList<String>();
		System.out.println(gmc.sumOfList(sArray));
		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			The method sumOfList(ArrayList<? extends Number>) in the type GenericMethodClass is not applicable for the arguments (ArrayList<String>)

			at GenericMethodDriver.main(GenericMethodDriver.java:30)

		*/
	}

}
