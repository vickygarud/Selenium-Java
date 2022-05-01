package TCS;

public class EvenOdd {
	
	static void Fact(int n)
	{
		int sum = 1;
		for(int i=n; i>=1; i--)
		{
			if(n % 2 == 0 && i % 2 == 0)
			{
				sum = sum * i;
			}
			else if(n % 2 != 0 && i % 2 != 0)
			{
				sum = sum * i;
			}
		}		
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		int no=6;
		Fact(no);
		
		
	}

}
