package Day_Dec23;

import java.util.Scanner;

public class TwoArraySum {

	
	/**
	 * Addition of two array
	 * 
	 * @param no
	 * @param arr
	 */
	int hasPairWithTarget(int arr[], int n, int target)
	{
	    int sum=0;
	    for(int i=0; i<arr.length; i++)
	    {
	        
	        for(int j=i+1; j<arr.length; j++)
	        {
	             n = arr[i]+arr[j]; 
	            
	            if(n==target)
	            {
	                return 1;
	            }
	            
	        }
	    }
	    
	    return 1;

	}
	public static void arrayAddition(int no, int arr[]) {
		
		int cnt=0;
		for (int i = 0; i < arr.length; i++) 
		{
			// add=arr[i];
			for (int j = i + 1; j < arr.length; j++)
			{
				int sum = arr[i] + arr[j];

				if (sum == no)
				{
					  System.out.println("Output is: "+i+","+j);
					//System.out.println("Output is: [" + (i) + "," + (j) + "]");
					cnt++;
				}
			}

		}
		
		if(cnt==0)
			System.out.println("Addition of two array are not equal to Target Number ..! ");
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = { 12, 17, 21, 25, 12 }; // 12+17, 12+21, ...

		

		System.out.print("Enter Target Number: ");
		int no = sc.nextInt();

		arrayAddition(no, arr);

		sc.close();

	}

}

/*
O/P -

Enter Target Number: 29
Output is: 0,1
Output is: 1,4


Enter Target Number: 29
Output is: [0,1]
Output is: [1,4]


Given an array of integers, find 2 numbers such that they add up to a
specific target number. eg: [12,17,21,25] and target number is 29 output
should be [0,1]. Please make use of array and function if possible Find
unique characters from a given array
 
 you could have taken array elements from user
 the way you accepted the target number from user
 
 */