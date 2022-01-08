package Bank;
public class TestCustomerAccounts {

	public static void main(String [] args) {
		AbstractBankAccount [] bankAccount = new AbstractBankAccount[5];
		
		bankAccount[0]= new Account("Sanjay Gupta",11557,300, AccountType.SAVINGS);

		bankAccount[1] = new Account("Tomas Garijo",12000,500, AccountType.CURRENT);
		bankAccount[2] = new Account("Maria Garijo",1500,1000, AccountType.SAVINGS);
	   
		bankAccount[3] = new CreditAccount("A.N Other", 88776, 500, AccountType.SAVINGS);
		bankAccount[4] = new CreditAccount("Another", 66778, 1000, AccountType.DEPOSIT);
		
		showAllCustomerAccounts(bankAccount);
		showAllAccounts(bankAccount);
		showAllCredictAccounts(bankAccount);
	}
	
	public static void showAllAccounts(AbstractBankAccount[] bankAccount) {
		System.out.println("\nAll Account types*****");
		for(AbstractBankAccount act: bankAccount)
			if(act instanceof Account)
				System.out.println(act);
	}
	
	public static void showAllCredictAccounts(AbstractBankAccount[] bankAccount) {
		System.out.println("\nAll Credict Account types*****");
		for(AbstractBankAccount act: bankAccount)
			if(act instanceof CreditAccount)
				System.out.println(act);
	}
	
	public static void showAllCustomerAccounts(AbstractBankAccount[] bankAccount) {
		System.out.println("\nAll Customer Accounts******");
		for(AbstractBankAccount act :  bankAccount) 
			System.out.println(act);
	}
}
