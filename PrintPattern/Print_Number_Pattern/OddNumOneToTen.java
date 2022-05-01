package Print_Number_Pattern;

public class OddNumOneToTen {

	public static void main(String[] args) {
		
		int i=1; int sum=10;
		
		
		while(i<=sum)
		{
			if(i==1)
				System.out.print("Odd Number 1 to 10: ");
			
				if(i%2!=0)
				System.out.print(i+" ");
				i++;
			
		}
	}

}


// O/P- Odd Number 1 to 10: 1 3 5 7 9 