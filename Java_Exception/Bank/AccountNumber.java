package Bank;

public class AccountNumber {

	private double balance;
	private int number;

	AccountNumber(int no) {
		this.number = no;
	}

	public void depositAmt(int amt) {
		System.out.println("Amount Credited: "+amt);
		this.balance += amt;
		
	}

	public  int withdrawnAmount(int amt) throws ExceptionAmt {
		System.out.println("Withdrawn Amount: "+amt);
		if (amt < this.balance) {
			this.balance -= amt;
		} else {
			 throw new ExceptionAmt("Insufficient balance");
		}
		
		return amt;
	}
	
	public double displayBalance()
	{
		return balance;
	}
	
	public double getNumber()
	{
		return number;
	}
}
