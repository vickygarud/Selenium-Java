package Print_Number_Pattern;

public class AdditionFirstFiveNumbers {

	public static void main(String[] args) {
		
		int sum=0;
		
		System.out.println("Addition of 1 to 10 numbers: ");
		for(int i=1; i<=10; i++)
		{
			
			System.out.print(i);
			if(i<=9)
				System.out.print(" + ");
			sum=sum+i;
		
		}
		
		System.out.println(" = "+sum+"\n");
		
		System.out.println("Multiplication of 1 to 5 numbers: ");

		sum=1;
		for(int i=1; i<=5; i++)
		{
			
			System.out.print(i);
			if(i<=4)
				System.out.print(" * ");
			sum=sum*i;
		}
		
		System.out.println(" = "+sum);
		
		System.out.println("\nUsing While Loop Addition\n");
		
		sum=0;
		
		int i=1;
		
		while(i<=5)
		{
			sum=sum+i;
			System.out.print(i);
			if(i<=4)
				System.out.print(" + ");
			i++;
		}
		
		System.out.println(" = "+sum);
		
		
		

	}

}

// O/p - 1 + 2 + 3 + 4 + 5 = 15

//       1 * 2 * 3 * 4 * 5 = 120
