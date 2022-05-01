package Logical_Codes;

public class VerifyArmstromgNumber {

	public static void main(String[] args) {
	
		int no=1634; int r; int sum=0;
		
		int num=no;
		
		int len = Integer.toString(no).length();
		
		System.out.println(len);
		
		while(num!=0)
		{
			r= num % 10;
	
			sum+=(int)Math.pow(r, len);
			num/=10;
		}
		
		if(sum==no)
			System.out.println(no+" Number is Armstrong Number");
		else
			System.out.println(no+" Number is NOT Armstrong Number");
	}

}

/* O/P

153 Number is Armstrong Number

*/