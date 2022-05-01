package ZENSAR;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		int a = 0;
		int b = 1;
		int temp = 0;
		for(int i=0; i<=15; i++)
		{
		    System.out.print(a+" ");
		    temp = a + b;
		    a = b;
		    b = temp;
		    
			
		}

	}

}

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144