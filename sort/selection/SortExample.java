package sort.selection;

public class SortExample {

	public static void main(String[] args) {
		int[] numbers = {40,7,59,4,1};
				
		//selectionSort(numbers);
		selectionSortOracle(numbers);
		displayValues(numbers);
		
	}

	public static void selectionSortOracle(int[] numbers ) {
		int indexMin = 0;
		for(int i = 0; i < numbers.length; i++) {
			indexMin = i;
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[j] < numbers[indexMin]) {
					indexMin = j;
				}
			}
			int temp = numbers[i];
			numbers[i] = numbers[indexMin];
			numbers[indexMin] = temp;
		}
		
	}
	
	static void selectionSort(int[] numbers) {
		int temp = 0;
		int x = 0;
		for(int i=0; i<numbers.length-1; i++) {
			while(x<numbers.length-1)
			{	
				if(numbers[x] > numbers[x+1]) {
					temp=numbers[x];
					numbers[x]=numbers[x+1];
					numbers[x+1]=temp;
					x++;
				}else 
					x++;
			}
			x=0;	
		}
	}
	private static void displayValues(int[] numbers) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "\n");
		}
		
	}
}
//40,7,59,4,1 x=0
//7,40,59,4,1 x=1
//7,40,59,4,2 x=2