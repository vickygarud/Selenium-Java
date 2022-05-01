package Bank;

public class HdfcBank {

	public static void main(String[] args) throws ExceptionAmt {

		AccountNumber ob = new AccountNumber(101010);
		try {
			ob.depositAmt(1000);
			System.out.println("Amount Balance: " + ob.displayBalance());
			ob.withdrawnAmount(500);
			System.out.println("Amount Balance: " + ob.displayBalance());
			ob.withdrawnAmount(5000);
		} catch (ExceptionAmt ea) {
			System.out.println(ea.getMessage());
			System.out.println(ea);

			ea.printStackTrace();
		}

		System.out.println("Thank You..!");

	}

}
