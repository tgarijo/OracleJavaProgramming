package sort.bubble;

public class BubbleExample {

	public static void main(String[] args) {

		int[] numbers = {40,7,59,4,1};
		
		displayValues(numbers);
		System.out.println("\n");
		//sortBubble(numbers);
		optimiuzeBubbleSort(numbers);
		displayValues(numbers);
	}

	static void optimiuzeBubbleSort(int[] numbers) {
		for(int i=0; i<numbers.length; i++) {
			boolean flag = false;
			for(int j=0; j < numbers.length-1; j++) {
				if(numbers[j] > numbers[j+1]) {
					flag=true;
					int temp = numbers[j+1];
					numbers[j+1] = numbers[j];
					numbers[j] = temp;
				}
			}
			if(!flag) return;
		}
		
	}

	private static void sortBubble(int[] numbers) {
		
		int temp=0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j =0 ; j < numbers.length-1; j++) {				
				if(numbers[j] > numbers[j+1]) {
					temp=numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
			
		}
		
	}
	
	
	private static void displayValues(int[] numbers) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "\n");
		}
		
	}

}
