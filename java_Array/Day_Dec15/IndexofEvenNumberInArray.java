package Day_Dec15;

public class IndexofEvenNumberInArray {

	public static void main(String[] args) {

		// int[] arr= new int[5];
		int[] arr = { 10, 13, 17, 16, 24, 30, 43, 50, 33, 21 };

		
		System.out.println("\n **** Print Even Number from array and Index Number Using for Loop ****** \n");
		 
		 
		for (int i = 0; i < arr.length; i++)
		{
			// System.out.println("Array Value: "+ arr[i]);

			if (arr[i] % 2 == 0)
				System.out.println("Even value of Array is: " + arr[i] + " Index Number is: " + (i));

		}
		
		System.out.println("\n **** Print Even Number from array and Index Number Using While Loop ****** \n");

		int i = 0;

		while (i < arr.length)
		{

			if (arr[i] % 2 == 0)
				System.out.println("Even value of Array is: " + arr[i] + " Index Number is: " + (i));
				i++;
		}

		

	}

}

/*
  O/P -
   

 **** Print Even Number from array and Index Number Using for Loop ****** 

Even value of Array is: 10 Index Number is: 0
Even value of Array is: 16 Index Number is: 3
Even value of Array is: 24 Index Number is: 4
Even value of Array is: 30 Index Number is: 5
Even value of Array is: 50 Index Number is: 7

 **** Print Even Number from array and Index Number Using While Loop ****** 

Even value of Array is: 10 Index Number is: 0
Even value of Array is: 16 Index Number is: 3
Even value of Array is: 24 Index Number is: 4
Even value of Array is: 30 Index Number is: 5
Even value of Array is: 50 Index Number is: 7



  
  
  
  int[] arr = { 10, 13, 17, 16, 24, 30, 43, 50, 33, 21 }
                 0   1   2   3   4   5   6   7   8   9
  
 Even Numbers- 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34,
 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56
  
 Odd Numbers -1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35,
 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57
 * 
 */