package WIPRO;
import java.util.*;

public class StringDistanceTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter String X:");
		String str1 = sc.nextLine();
		
		System.out.print("Enter String Y:");
		String str2 = sc.nextLine();
		
		
		int a=0,b = 0;
		for(int i=0; i<str1.length(); i++)
		{
			
			if(str1.charAt(i) != str2.charAt(i))
			{
				for(char j=97; j<=122; j++)
				{
					if(str1.charAt(i)==j)
						a=j;
					
						//a = Character.getNumericValue(j);
					
					if(str2.charAt(i)==j)
						b=j;
						//b=Character.getNumericValue(j);	
				}
			}
		}
		System.out.println(a);
		
		System.out.println(b);
		
		System.out.println("Distance of string is: "+(a-b));
		
		
		sc.close();

	}

}


//int a=Character.getNumericValue(c)

/*
I/P - 
hears
heard

O/P-
15

Enter String X:hears
Enter String Y:heard
115
100
Distance of string is: 15



*/