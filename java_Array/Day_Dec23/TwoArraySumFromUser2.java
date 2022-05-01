package Day_Dec23;

import java.util.Scanner;

public class TwoArraySumFromUser2 {

	/**
	 * Addition of two array 
	 * print multiple two numbers addition 
	 * 
	 * @param no
	 * @param arr
	 */

	public static void arrayAdd(int no, int arr[])
	{
		int cnt=0;
		for (int i = 0; i < arr.length; i++)
		{

			for (int j = i + 1; j < arr.length; j++)
			{

				int sum = arr[i] + arr[j];

				if (sum == no)
				{
					System.out.println(i+","+j);
					cnt++;
				}

			}

		}
		
		if(cnt==0) 
			System.out.println("Addition of two array are not equal to Target Number ..!");

	}

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter length of Array: ");
		int len = sc.nextInt();

		int arr[] = new int[len];

		int n = 0;

		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print("Enter Array Value of index " + n++ + ": ");
			arr[i] = sc.nextInt();
			// System.out.println();
		}

		System.out.print("\nEnter Target Number: ");
		int no = sc.nextInt();

		arrayAdd(no, arr);

		sc.close();

	}

}

//{ 12, 17, 21, 25, 12 };
/*
O/P-

Enter length of Array: 5
Enter Array Value of index 0: 30
Enter Array Value of index 1: 10
Enter Array Value of index 2: 50
Enter Array Value of index 3: 20
Enter Array Value of index 4: 20

Enter Target Number: 40
0,1
3,4

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
