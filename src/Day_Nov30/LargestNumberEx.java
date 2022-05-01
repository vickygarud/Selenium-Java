package Day_Nov30;

public class LargestNumberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		a= 100; b=20; c=20;
		
		if(a>=b && a>=c)
		{
			
			if(a>b && b>c)
			{ 
				System.out.println("Largest number is: "+a+" & Smallest number is: "+b+" and " +c);
			}
			else if (a==b && a==c)
				System.out.println("Largest Number is: "+a);
			else if (b==c && b==a)
				System.out.println("Largest Number is: "+b);
			else if (c==a && c==b)
				System.out.println("Largest Number is: "+c);
				
		}
		
		else if(b>=a && b>=c)
		{
		
			System.out.println("Largest number is: "+b+" & Smallest number is: "+a+" and " +c);
			
		}
		else if(c>=a && c>= b)
		{
			
			System.out.println("Largest number is: "+c+" & Smallest number is: "+a+" and " +b);
			
		}

	}

}
