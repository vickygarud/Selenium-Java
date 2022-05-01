package WIPRO;

import java.util.Scanner;

public class PrimeAddition {
	
	static void prime(int a,int b)
	{
		int sum=0;
		for(int no=a; no<=b; no++)		// -29 < =-6
		{
			int cnt=0;			
			for(int j=no; j <=-1; j++)		// -29 < = -1 
			{
				if(no % j == 0)
				{
					//System.out.println(a);
					cnt++;	
				}
			}
			
			if(cnt==2)
			{
				System.out.print(no+" ");
				sum=sum+no;	
			}
			
		}
		
		System.out.println("\nsum: "+sum);	
	}

	public static void main(String[] args) {
		
		prime(-29,-6);
		
		
	}

}

//  divided by 1 and itself


// 1 2 4 9 10




