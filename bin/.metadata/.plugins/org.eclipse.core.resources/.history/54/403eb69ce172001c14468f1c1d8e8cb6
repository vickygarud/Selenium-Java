package project;

import java.util.Scanner;

public class BankHdfc {
	static String bank = "HDFC Bank";
	String custName;
	int accNo;
	double accBal;

	Scanner sc = new Scanner(System.in);
	 {
		System.out.println("\n||    Welcome to Hdfc Bank    ||\n");
	}
	
	 // to create account
	void accOpen() {
		
		System.out.println("\n || Enter Customer Information ||\n");

		System.out.print("Enter Customer Name      : ");
		this.custName = sc.nextLine();

		System.out.print("Enter Account Number     : ");
		this.accNo = sc.nextInt();

		System.out.print("Enter Account to Deposit : ");
		this.accBal = sc.nextDouble();

		createAccount(this.custName, this.accNo, this.accBal);

	}
	
	// to validate account details
	void createAccount(String customerName, int accNumber, double accBalance) {
		String strPattern = "^[a-zA-Z ]{4,20}$";
		if (accBalance <= 10000)
			throwException(1);
		else if (!(customerName.matches(strPattern)))
			throwException(2);
		else if (accNumber <=3)
			throwException(3);
		else {
			this.custName = customerName;
			this.accNo = accNumber;
			this.accBal = accBalance;
			System.out.println("\nAccount created Successfully..!\n");
			//oprationPerform();
		}

	}


	
	// to withdrawn balance
	void withdrawBal(double withdrawn) {
		if(withdrawn>accBal)
			throwException(4);
		else
		{
		this.accBal = accBal-withdrawn;
		System.out.println("\nAccount withdrawn Successfully..!\n");
		}
		//oprationPerform();

	}

	//to get balance
	void getBalance() {
		System.out.println("Account Balance: " + this.accBal);

	}
	
	//to deposit money
	void balDeposit(double credit)
	{
		if(credit>0)
		{
		this.accBal=this.accBal+credit;
		System.out.println("\nAmount Deposit Successfully..!!\n");
		}
		else
			throwException(5);
			
		
	}
	//to display details
	void accDetails() {
		System.out.println("Bank Name      : " + BankHdfc.bank);
		System.out.println("Customer Name  : " + this.custName);
		System.out.println("Account Number : " + this.accNo);
		System.out.println("Account Balance: " + this.accBal + "\n");

	}

	// to handle exceptions
	void throwException(int no) {
		switch (no) {
		case 1:
			System.out.println("\nAmount Should be Greater than 10000. ");
			accOpen();
			break;
		case 2:
			System.out.println("\nEnter valid username A-Z,a-z. ");
			accOpen();
			break;
		case 3:
			System.out.println("\nEnter 3 digit Account Number. ");
			accOpen();
			break;
		case 4:
			System.out.println("\nAccount Balance is not sufficient. ");
			break;
		case 5:
			System.out.println("Enter Amount more than zero.");
			break;
		}
	}
}
