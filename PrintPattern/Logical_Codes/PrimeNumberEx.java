package Logical_Codes;

public class PrimeNumberEx {

	public static void main(String[] args) {
		
		int i=1;
			
			while(i<=20)
			{
				boolean flag=false;
				for(int j=2; j<=i-1; j++)  // 2 3 4 5 6 6 7....20
				{
					int r= i % j;
					if(r==0)
					{
						//System.out.println(i+" is NOT Prime Number");
						flag=true;
						break;
					}
					
				}
				
				if(i>1)
				{
					
					if(flag==false)
						System.out.println(i+" is Prime Number");
				}
					i++;
				
			}

	}

}

/*   
 
2 is Prime Number
3 is Prime Number
5 is Prime Number
7 is Prime Number
11 is Prime Number
13 is Prime Number
17 is Prime Number
19 is Prime Number

 */
