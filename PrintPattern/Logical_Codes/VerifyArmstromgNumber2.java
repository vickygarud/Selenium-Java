package Logical_Codes;

public class VerifyArmstromgNumber2
{
	public static void main(String[] args) {
		
		int no = 121;
		
		int temp = no;
		
		int reverse = 0;
		
		while (temp!=0)
		{
			int remainder = temp % 10;  	//  r = 1 ,  2 , 1 
			
			System.out.println("++ "+remainder);
			reverse = reverse * 10 + remainder; // 0 * 1 + 1 = 1 ,  1 * 10 + 2 = 12 , 12 * 10 + 1 = 121
			//System.out.println(reverse);
			temp = temp / 10;  					// 12 , 2 , 0
			//System.out.println("** "+temp);
		}
	
	if (no == reverse) 
		System.out.println("Number is Palindrome: " + no);
	else
		System.out.println("Number is NOT Palindrome: "+no);
	
	
	
	
	String str = Integer.toString(no);
	System.out.println(str);
	String str2 = "";
	
	for(int i = str.length()-1; i>=0; i--)
	{
		 str2 = str2+str.charAt(i);
	}

	int t = Integer.valueOf(str2); ;

	if(no==t)
		System.out.println("Number is Palindrome: " + no);
		else
			System.out.println("Number is NOT Palindrome: "+no);
		
	
	
	}


	
	
	
	
	
	
}

/*

10 / 2

0.2

10/20

*/