package Print_Number_Pattern;

public class FirstFiveNumMulti {

	public static void main(String[] args) {
		
		int i=1; int sum=1;
		
		
		while(i<=5)
		{
			
			System.out.print(i);
			
			if (i < 5)
				System.out.print(" * ");
			sum=sum*i;
			i++;
		}
		
		System.out.println(" = "+sum);

	}

}

// O/P - 1 * 2 * 3 * 4 * 5 = 120       
