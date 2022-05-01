package Logical_Codes;

public class PrimeNumberOnetoTwenty {

	public static void main(String[] args) {
		
		int i=1;
	//	int no=1;
		
		
		while(i<=20)
		{
			int no=i;
			boolean flag=false;
			for(int j=2; j<=no-1; j++)  // 2 3 4 5 6 6 7....20
			{
				int r= no % j;
				if(r==0)
				{
					//System.out.println(no+" is NOT Prime Number");
					flag=true;
					break;
				}
				
			}
			
				
				if(flag==false) {
					System.out.println(no+" is Prime Number");
				}
					i++;
		}
	}
}

/*  

Prime Number is a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11).
2, 3, 5, 7, 11, 13, 17, 19

(Number it should be only two factors)


*/
