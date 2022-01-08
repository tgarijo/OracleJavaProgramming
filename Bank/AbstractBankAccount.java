package Bank;

public abstract class AbstractBankAccount {

	public final String BANK = "JavaBank";
	
	// class variables
	protected String accountname;
    protected int accountnum;
    protected int balance;
    
    abstract public void deposit(int amt);
    
    public AbstractBankAccount(String name, int num,int amt)
    {
        accountname=name;
	    accountnum=num;
        balance=amt;
    }
	
	public String getBankName() {		
		return this.BANK;
	}

	public String getAccountname(){    	
	    return accountname;
	}
	 
    public void setAccountname(String name){
    	    accountname = name;
    }

    public int getAccountnum(){ 
    	return accountnum;
    }
    
    public void setAccountnum(int num){
    	    accountnum = num;
    }
        
    public int getBalance() {    	 
    	return balance;
    }
    
    public void setBalance(int num){
    	balance = num;
    }

    public void withdraw(int amt){
    	balance=balance-amt;
    }
    
    public String toString() {
    	return "Bank Name \t: " + getBankName() +
    			"\nAccount Holder  : " + accountname + 
    			"\nAccount Number  : " + accountnum + 
    			"\nAccount balance : " + balance + "\n";   			
    }
}
