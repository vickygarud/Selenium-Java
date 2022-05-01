package Day_Dec15;

public class FindEvenStringFromArray {

	public static void main(String[] args) {

		String[] arr = { "Rainy", "Summer", "Snow", "Spring", "Fall", "Winter", "Hot" };

		/*
		 * for(String str: arr) System.out.println(str);
		 */
		System.out.println("\n*** String and length ***\n");

		for (int i = 0; i < arr.length; i++)
			System.out.println("String is: " + arr[i] + " and length is: " + arr[i].length());
		
	

		System.out.println("\n******* Print Even length String using for loop **********\n");
		
		

		for (int i = 0; i < arr.length; i++) 
		{
			int len = arr[i].length();

			if (len % 2 == 0)
				System.out.println("Even length String is: " + arr[i] + " Lenght is: " + arr[i].length());
		}
		
		
		System.out.println("\n******* Print Even length String using while loop **********\n");
		

		int i = 0;

		while (i < arr.length)
		{

			if (arr[i].length() % 2 == 0)
				System.out.println("Odd Length String is: " + arr[i] + " Length is: " + arr[i].length());
			
			i++;

		}
	}
}

/*
 
O/P- 


*** String and length ***

String is: Rainy and length is: 5
String is: Summer and length is: 6
String is: Snow and length is: 4
String is: Spring and length is: 6
String is: Fall and length is: 4
String is: Winter and length is: 6
String is: Hot and length is: 3

******* Print Even length String using for loop **********

Even length String is: Summer Lenght is: 6
Even length String is: Snow Lenght is: 4
Even length String is: Spring Lenght is: 6
Even length String is: Fall Lenght is: 4
Even length String is: Winter Lenght is: 6

******* Print Even length String using while loop **********

Odd Length String is: Summer Length is: 6
Odd Length String is: Snow Length is: 4
Odd Length String is: Spring Length is: 6
Odd Length String is: Fall Length is: 4
Odd Length String is: Winter Length is: 6


 */
