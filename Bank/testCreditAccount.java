package Bank;
public class testCreditAccount {
	

	public static void main(String[] args) {
	     
		// Instantiate 3 accounts
	    // Using constructor with values
		Account a1 = new Account("Sanjay Gupta",11556,300, AccountType.DEPOSIT);

		Account a2 = new Account("Tomas Garijo",12000,500, AccountType.SAVINGS);
		Account a3 = new Account("Maria Garijo",1500,1000, AccountType.CURRENT);
	   
		CreditAccount c1 = new CreditAccount("A.N Other", 88776, 500, AccountType.CURRENT);
		CreditAccount c2 = new CreditAccount("Another", 66778, 1000, AccountType.SAVINGS);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(c1);
		System.out.println(c2);
		
		
		
    }
}

