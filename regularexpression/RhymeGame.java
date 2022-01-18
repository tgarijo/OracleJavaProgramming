package regularexpression;

import java.util.Scanner;

public class RhymeGame {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String animal;
		
		if(rhymnigAnimal(getAnimal(in))) {
			System.out.println("This animal rhymers with cat");
		}else 
			System.out.println("This animal no rhymers with cat");
		
		in.close();
	}
	
	private static boolean rhymnigAnimal(String animal) {
	
		return animal.matches("[a-zA-Z]{1,2}(at|AT)");
		
	}
	
	private static String getAnimal(Scanner in) {
		System.out.println("Please enter the name of animal: ");
		return in.next();
		
	}
	

}
