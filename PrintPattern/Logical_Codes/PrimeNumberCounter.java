package Logical_Codes;

public class PrimeNumberCounter {

	public static void main(String[] args) {
		
		int i=1;
		int cnt=0;
		int to=5;
		
		while(true)
		{
			boolean flag=false;

			for(int j=2; j<=i-1; j++)
			{
				int r=i % j;
				
				if(r==0)
				{
					//System.out.println(no+" Is NOT Prime Number");
					flag=true;
					break;
				}
			}
			
			if(flag==false)
				System.out.println(i+" Is Prime Number");
			cnt++;
			
			if(cnt==to)
				break;
			
			i++;
				
		}

	}

}

/*  
 
 O/P -
1 Is Prime Number
2 Is Prime Number
3 Is Prime Number
5 Is Prime Number

 2, 3, 5, 7, 11, 13, 17, 19
 
 */
