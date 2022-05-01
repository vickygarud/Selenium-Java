package Day_Dec15;

public class IndexofOddNumberInArray {

	public static void main(String[] args) {
		
		
		int[] arr = { 10, 13, 17, 16, 24, 30, 43, 50, 33, 21 };

		System.out.println("\n **** Print Odd Number from array and Index Number Using for Loop ****** \n");
		
		for (int i = 0; i < arr.length; i++)
		{
			// System.out.println("Array Value: "+ arr[i]);

			if (arr[i] % 2 != 0)
				System.out.println("Odd value of Array is: " + arr[i] + " Index Number is: " + (i));

		}
		
		System.out.println("\n **** Print Odd Number from array and Index Number Using While Loop ****** \n");

		int i = 0;

		while (i < arr.length)
		{

			if (arr[i] % 2 != 0)
				System.out.println("Odd value of Array is: " + arr[i] + " Index Number is: " + (i));
				i++;
		}

	}

}

/* 
O/P -



 **** Print Odd Number from array and Index Number Using for Loop ****** 

Odd value of Array is: 13 Index Number is: 1
Odd value of Array is: 17 Index Number is: 2
Odd value of Array is: 43 Index Number is: 6
Odd value of Array is: 33 Index Number is: 8
Odd value of Array is: 21 Index Number is: 9

 **** Print Odd Number from array and Index Number Using While Loop ****** 

Odd value of Array is: 13 Index Number is: 1
Odd value of Array is: 17 Index Number is: 2
Odd value of Array is: 43 Index Number is: 6
Odd value of Array is: 33 Index Number is: 8
Odd value of Array is: 21 Index Number is: 9



*/