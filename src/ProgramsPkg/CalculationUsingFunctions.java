package ProgramsPkg;

import java.util.Scanner;

public class CalculationUsingFunctions {

	public static void MathOperations(double x, double y)
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Select Option to perform:\n"
				+ "Addition      : 1 \n" 
				+ "Subtraction   : 2\n"
				+ "Multiplication: 3\n" 
				+ "Division      : 4\n" 
				+ "For Exit      : 5");
		
		int no = sc.nextInt();
		
		if (no > 0 && no < 5)
		{
			System.out.println("Enter First Number: ");
			x = sc.nextDouble();

			System.out.println("Enter Second Number: ");
			y = sc.nextDouble();
		}

		double result = 0;

		switch (no) {
		case 1:
			result = x + y;
			System.out.println("\nAddition of :\n" + x + " + " + y + " = " + result + "\n");
			break;
		case 2:
			result = x - y;
			System.out.println("\nSubtraction   of :\n" + x + " - " + y + " = " + result + "\n");
			break;
		case 3:
			result = x * y;
			System.out.println("\nMultiplication of :\n" + x + " * " + y + " = " + result + "\n");
			break;
		case 4:
			result = x / y;
			System.out.println("\nDivision of :\n" + x + " / " + y + " = " + result + "\n");
			break;
			
		case 5:
			System.out.println("Task Quit..!!");
			sc.close();
			System.exit(0);
			break;

		default:
			System.out.println("Invalid Option..!!" + "\n");

		}
		
	}
	

	public static void main(String[] args) {
		while (true)
		{
			MathOperations(0,0);
			
		}

	}

}

/*
 * 
Select Option to perform:
Addition      : 1 
Subtraction   : 2
Multiplication: 3
division      : 4
For Exit      : 5
1
Enter First Number: 
10
Enter Second Number: 
20

Addition of :
10.0 + 20.0 = 30.0

Select Option to perform:
Addition      : 1 
Subtraction   : 2
Multiplication: 3
division      : 4
For Exit      : 5
3
Enter First Number: 
20
Enter Second Number: 
30

Multiplication of :
20.0 * 30.0 = 600.0

Select Option to perform:
Addition      : 1 
Subtraction   : 2
Multiplication: 3
division      : 4
For Exit      : 5
5
Task Quit..!!


*/
