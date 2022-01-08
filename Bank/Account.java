package Bank;

public class Account extends AbstractBankAccount{

	
		private int bonusValue;
		
		private AccountType type;
		
		
		Account(String name, int num, int amt, AccountType type){ 
			super(name, num,(amt + calculateInitialBonus(amt)));
			bonusValue = calculateInitialBonus(amt);
			this.type = type;
		}
		
		public static int calculateInitialBonus(int amt) {
			if (amt >= 1 && amt <= 100)
				return 10;
			else if(amt <= 300)
				return 20;
			else 
				return 30;
						
		}
		
		
	    
	    //make a deposit to the balance
	    public void deposit(int amt)
	    {
	    	if(amt >100)
	    		balance=balance+(amt +(int)(bonusValue * 0.1));
	    	else
	    		balance=balance+amt;
	    }
	   

	    
	    public String toString() {	    
	    	return "Account Type    : " + this.type + "\n" +
	    			super.toString();
	    }

}