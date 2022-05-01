package Logical_Codes;

public class FindPalindormNumber {
	
	public static void main(String[] args) {
		
		
		int no = 153 ;
		
		
		int temp = no;
		int rev = 0;
		
		while(temp != 0)
		{
			int rem = temp % 10;
			
		    rev = rev * 10 + rem;
			
			temp/=10;
			
		}
		
		if (rev == no)
			System.out.println("Numner is palindrome: "+no);
		else
			System.out.println("Numberr is Not Palindrome: "+no);
		
		int ref = no;
		int sum = 0;
		while(ref != 0)
		{
			int rem = ref % 10;
			
		    sum =  (int) (sum + Math.pow(rem, 3));
			
			ref/=10;
		}
		
		if(sum==no)
			System.out.println("Number is Armstrong Number: "+no);
		else
			System.out.println("Number is Not Armstronng Number: "+no);
		
		
		
		
	}

}
