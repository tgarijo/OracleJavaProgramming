package regularexpression;

import java.util.Scanner;

public class SsnCheck {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String ssn;
		ssn = getSsn(in);
		if(validSsn(ssn)) {
			System.out.println(ssn + " is a valid Social Security number!");			
		}else {
			System.out.println("This ssn is not valid! must be in the format"
					+ " of (999-99-9999)" );
		}

		in.close();
	}
	
	private static String getSsn(Scanner in) {
		System.out.println("Please enter your Social Security Number: ");
		return in.next();
	}
	
	static boolean validSsn(String ssn) {
		// threee numbers
		// a dash
		// two numbers
		// a dash
		// four numbers
		
		return ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}");
	}

}
