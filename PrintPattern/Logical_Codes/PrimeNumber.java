package Logical_Codes;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int no=25;
		boolean flag=false;
		
		for(int i=2; i<=no-1; i++)
		{
			int r= no % i;
			
			if(r==0)
			{
				System.out.println(no+" is NOT Prime Number");
				flag=true;
				break;
			}
			
		}
		
		if(flag==false)
			System.out.println(no+" is Prime Number");
	}

}

// O/P - 25 is NOT Prime Number




/*  

Prime Number is a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11).

(Number it should be only two factors)


*/