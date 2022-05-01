package Day_Nov30;

import java.util.Scanner;

public class Grade {
	
	public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	
			  System.out.println("Enter Student Name: ");
			  sc.next();
		  
			  System.out.println("Enter Percentage: ");
			  float a=sc.nextFloat();
		  
			if (a <= 100 && a > 75)
			{
				System.out.println("Marks: " + a + " Result: Pass with distinction");
			} else if (a < 70 && a > 50)
			{
				System.out.println(" Marks: " + a + " Result: Pass");
			}

			else if (a < 50 && a >= 0) {
				System.out.println("Marks: " + a + " Result: Fail ");
			}	
	   
	   sc.close();
	}

}
