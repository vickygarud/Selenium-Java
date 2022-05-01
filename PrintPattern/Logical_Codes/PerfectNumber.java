package Logical_Codes;

public class PerfectNumber {

	public static void main(String[] args) {
		
		int no=6;
		int sum=0;
		
			for(int div=1; div<no; div++)
			{
				int r= no % div;    // 6 % 1 === 0   // 9 % 1 = | 9 % 2  | 9 % 3
				
				if(r==0)
				{
					//System.out.print(div);
				    sum= sum+div;     // s= 0 + 1  |   sum +6 
				}
			}
			if(sum==no)
			
				System.out.println(no+" is Perfect Number");
			else
				System.out.println(no+" is NOT Perfect Number");
			no++;
			
	}

}

/*   

O/P - 6 is Perfect Number

 
 
 6 factors 1+2+3= 6 
 6=6 = perfect Number
 
 */
