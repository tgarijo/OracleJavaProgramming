package Bank;

public class testBank {
	
	public static void main(String[] args) {
     
	// Instantiate 3 accounts
		// Using constructor with values
    Account A1 = new Account("Sanjay Gupta",11556,300,AccountType.DEPOSIT);
   
    	// Using default constructor
	Account A2 = new Account("Tomas Garijo",12000,500,AccountType.SAVINGS);
	Account A3 = new Account("Maria Garijo",1500,1000, AccountType.SAVINGS);
	
	System.out.println(A1);
	System.out.println(A2);
	System.out.println(A2);

	}
}
