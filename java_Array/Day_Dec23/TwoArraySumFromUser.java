package Day_Dec23;

import java.util.Scanner;

public class TwoArraySumFromUser {

	/**
	 * Addition of two array 
	 * returns only two number addition from array 
	 * 
	 * @param no
	 * @param arr
	 */

	public static int[] arrayAdd(int no, int arr[])
	{
		int res[] = new int[6]; int index=0; int j;
		
		for (int i = 0; i < arr.length; i++)
		{

			for (j = i + 1; j < arr.length; j++)
			{

				int sum = arr[i] + arr[j];

				if (sum == no)
				{
					res[index++]=i;
					res[index++]=j;
				}
					
				
			}
			



		}
		//int res[] = new int[cnt]
		return res;

	}

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		//System.out.print("Enter length of Array: ");
		//int len = sc.nextInt();

		int arr[] = {20,15,25,20,5};
		int no=40;

		/*
		 * int n = 0;
		 * 
		 * for (int i = 0; i < arr.length; i++) {
		 * System.out.print("Enter Array Value of index " + n++ + ": "); arr[i] =
		 * sc.nextInt(); // System.out.println(); }
		 * 
		 * System.out.print("\nEnter Target Number: "); int no = sc.nextInt();
		 */
		int[] print = arrayAdd(no, arr);

		if (print == null)
		{
			System.out.println("Addition of two array are not equal to Target Number ..!");
		} else
			for (int i = 0; i < print.length; i++) 
			{
				System.out.print(print[i] + " ");
			}
		
		

		sc.close();

	}

}

//{ 12, 17, 21, 25, 12 };
/*
O/P-

Enter length of Array: 4
Enter Array Value of index 0: 23
Enter Array Value of index 1: 25
Enter Array Value of index 2: 50
Enter Array Value of index 3: 30

Enter Target Number: 75
1 2 


Enter length of Array: 4
Enter Array Value of index 0: 12
Enter Array Value of index 1: 17
Enter Array Value of index 2: 21
Enter Array Value of index 3: 25

Enter Target Number: 12
Addition of two array are not equal to Target Number ..!

*/
