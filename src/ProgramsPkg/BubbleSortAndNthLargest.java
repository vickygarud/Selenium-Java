package ProgramsPkg;

import java.util.Scanner;

public class BubbleSortAndNthLargest {

	public static int[] sortedArray(int sort[]) 
	{
		boolean flag = true;

		for (int i = 0; i < sort.length - 1; i++) 
		{

			for (int j = 0; j < sort.length - i - 1; j++)
			{

				if (sort[j] > sort[j + 1])
				{
					int temp = sort[j];
					sort[j] = sort[j + 1];
					sort[j + 1] = temp;
					flag = false;
				}
			}
			if (flag == true)
				break;

		}
		return sort;
	}

	// 1 2 3 4 5
	// 33 35 58 90 99
	// 0 1 2 3 4
	public static void findNlargest(int nthlarge[], int num)
	{

		if (num > 0 && num <= nthlarge.length)
		{
			int no = num - 1;

			System.out.println(num + " Largest Number is: " + nthlarge[no]);
		} 
		else
			System.out.println("nth larget number is out of scope Enter valid number");

	}

	static void printArray(int a[])
	{
		System.out.println("\nOriginal Array");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Array Length: ");
		int len = sc.nextInt();

		int arr[] = new int[len];

		System.out.println("Enter " + len + " Array Values: \n");
		int n = 1;
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print("Enter value " + (n++) + ": ");
			arr[i] = sc.nextInt();
		}

		BubbleSortAndNthLargest.printArray(arr);

		int sortArray[] = sortedArray(arr);

		System.out.println("\n\nSorted Array: ");
		for (int i = 0; i < sortArray.length; i++)
			System.out.print(sortArray[i] + " ");
		
		
		
			System.out.print("\n\nEnter nth larget number to find range is " + 1 + " to " + sortArray.length + ": ");
			int no = sc.nextInt();
			findNlargest(sortArray, no);
		
		  sc.close();
	}

}

/*
 * 
 * Enter 10 Array Values:
 * 
 * Enter value 1: 5 Enter value 2: 4 Enter value 3: 3 Enter value 4: 2 Enter
 * value 5: 1 Enter value 6: 1 Enter value 7: 2 Enter value 8: 3 Enter value 9:
 * 4 Enter value 10: 5
 * 
 * Original Array 5 4 3 2 1 1 2 3 4 5
 * 
 * Sorted Array: 1 1 2 2 3 3 4 4 5 5
 * 
 * Enter nth larget number to find range is 1 to 10: 5 5 Largest Number is: 3
 * 
 * 
 * 
 * 
 * Enter Array Length: 5 Enter 5 Array Values:
 * 
 * Enter value 1: 35 Enter value 2: 33 Enter value 3: 55 Enter value 4: 22 Enter
 * value 5: 55
 * 
 * Original Array 35 33 55 22 55
 * 
 * Sorted Array: 22 33 35 55 55
 * 
 * Enter nth larget number to find range is 1 to 5: 9 nth larget number is out
 * of scope Enter valid number
 * 
 */

/* 
Enter Array Length: 5
Enter 5 Array Values: 

Enter value 1: 35
Enter value 2: 19
Enter value 3: 44
Enter value 4: 22
Enter value 5: 66

Original Array
35 19 44 22 66 

Sorted Array: 
19 22 35 44 66 

Enter nth larget number to find range is 1 to 5: 5
5 Largest Number is: 66
*/
