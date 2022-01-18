package binary.search;

import sort.selection.SortExample;
public class BinarySearch {

	public static void main(String[] args) {
		
		//int[] numbers = {40,7,59,4,1};
		int[] numbers = new int[1000001];
		for(int x=0; x < 1000000; x++) {
			numbers[x] = x;
		}

		System.out.println("Numbers added");
		//binarySearch(numbers, 3680);
		
		SortExample.selectionSortOracle(numbers);
		//displayValues(numbers);
		binarySearch(numbers, 36895);
	}
	
	static public void binarySearch(int[] numbers, int value) {
		int low = 0;
		int high = numbers.length - 1 ;
		
		while(high >= low) {
			int middle = (low + high)/2;
			if(numbers[middle] == value) {
				System.out.println("The number " + value + " is at position "
						+ middle + " in the list");
				return;
			}
			if(numbers[middle] < value) {
				low = middle +1;				
			}
			if(numbers[middle] > value) {
				high = middle - 1;
			}
			
		}
		System.out.println("The number " + value + " is not in the list");
	}

	private static void displayValues(int[] numbers) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "\n");
		}
		
	}
}
