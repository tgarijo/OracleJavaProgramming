package Bank;

import java.util.Scanner;

public class AssertEx {

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please  enter a number: ");
		double x = in.nextDouble();
		in.close();
		
		assert x < 2_147_483_647.0 : "Number to large to convert to integer";
		System.out.println("Value of x: " + x);
		int y = (int) (x);
		
		System.out.println(y);
		
	}
	
}
