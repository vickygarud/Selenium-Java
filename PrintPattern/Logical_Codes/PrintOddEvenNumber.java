package Logical_Codes;

public class PrintOddEvenNumber {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++)
		{
			if(i==1)
			System.out.print("Even Numbers 1 to 10: ");
			
			if(i%2==0)
				System.out.print(i+" ");
		}
		
		for(int i=1; i<=10; i++)
		{
			if(i==1)
				System.out.print("\n \nOdd Numbers 1 to 10: ");
			
			if(i%2!=0)
				System.out.print(i+" ");
				
		}

	}

}
/*

Even Numbers 1 to 10: 2 4 6 8 10 
 
Odd Numbers 1 to 10: 1 3 5 7 9 

*/
