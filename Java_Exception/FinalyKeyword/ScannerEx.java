package FinalyKeyword;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		
	
	 Scanner scn = new Scanner(System.in);
     try
     {
         int n = Integer.parseInt(scn.nextLine());
         if (99%n == 0)
        	 System.out.println(n + " is a factor of 99");
     }
     catch (NumberFormatException e) {
    	 
    	 System.out.println("catch block");
		
     }
     finally {
		
    	 System.out.println("Last block");
    	
	}
     
     
     

	}
}
