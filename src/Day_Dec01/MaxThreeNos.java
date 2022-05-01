package Day_Dec01;

public class MaxThreeNos {
	
	public static void main(String[] args) {
		
		int a=30, b=40, c=50, d=60;
		
		if (a>b)
		{
			if (a>c)
			{
				if (a>d)
					System.out.println("Largest Number is: "+a);
				else 
					System.out.println("Largest Number is: "+d);
			}
			else if(c>d)
					System.out.println("Largest Number: " +c);
				else
					System.out.println("Largest Number: "+d);
		}
			else if(b>c)
			{
				if (b>d)
					System.out.println("Largest Number is: "+b);
				else	
					System.out.println("Largest Number is: "+d);
			}
				else if (c>d)
				
						System.out.println("Largest Number is: "+c);
					else
					
						System.out.println("Largest Number is: "+d);
				
		}
	}
