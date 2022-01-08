package Bank;


public class CreditAccount extends AbstractBankAccount{

	
	int creditLimit;	
	private AccountType type;
	
	public CreditAccount(String name, int num, int amt,  AccountType type) {
		super(name, num, amt);
		this.creditLimit=calculateCreditLimit(amt);
		this.type = type;
	}

	private static int calculateCreditLimit(int amt) {
		if(amt>1 && amt<=2000)
			return 100;
		else if(amt<=4000)
			return 200;
		else
			return 300;
	}
	

	
	public String toString() {
    	return "Account Type    : " + this.type +
    			"\nCredit Limit    : " + creditLimit + "\n" +  
    			super.toString();
    			
    			    
      }

	@Override
	public void deposit(int amt) {
		balance=balance+amt;
		
	}
}
