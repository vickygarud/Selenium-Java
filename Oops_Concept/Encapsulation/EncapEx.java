package Encapsulation;


class First
{
	private int accNo;         	// private member
	private String custName;
	
	
	public void setDetails(int no, String name)
	{
		this.accNo = no;
		this.custName = name;
	}
	
	public int getDetails()			
	{
		return this.accNo;
	}
	public String getDetails1()
	{
		return this.custName;
	}
	
	
	public String[] allDetails()
	{
		
		String arr[] = { Integer.toString(accNo), custName};
		return arr;
		
	}
	
}

public class EncapEx {
	
	public static void main(String[] args) {
	
	First obj = new First();
	obj.setDetails(101,"jack");
	
	System.out.println("Account Number: "+obj.getDetails()+"\n"
					  +"Customer Name : "+obj.getDetails1());
	
	
	String arr[]=obj.allDetails();
	
	System.out.println("Customer Details: ");
	for(String temp: arr)
		System.out.println(temp);
	
	}
}

/*

we can't access private member directly that is encapsulation
we can access private member with the help of only getDetails method we cannot access directly

we bind all data members and attributes to one method

*/