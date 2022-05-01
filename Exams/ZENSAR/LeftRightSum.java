package ZENSAR;

import java.util.Scanner;

public class LeftRightSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter L: ");
		int left = sc.nextInt();

		System.out.println("Enter R: ");
		int right = sc.nextInt();

		int sum = 0;
		
		// first approach
		for (; left <= right; left++) //
		{
			String len = Integer.toString(left);
			sum = sum + (left * len.length());
		}
		
		System.out.println("Output: "+sum);
		
		
		
		// Second approach
		
		/*
		  for (int i = left; left <= right; left++) //
		   { 
		   	int temp = left; int cnt = 0;
		  
		  		while (temp != 0)
		   	{
		   		 temp = temp / 10; cnt++; 
		   	}
		  
		  		sum = sum + (left * cnt);
		   }
		  
		  		System.out.println("Output is : " + sum);
		  */
		 

		
		
		
		

		sc.close();
	}

}

/*
i/p - 
10  -> value of l
100 -> value of r

O/P-
10110

5   -> value of l
10  -> value of r

O/P-
55

*/