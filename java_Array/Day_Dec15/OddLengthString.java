package Day_Dec15;

public class OddLengthString {

	public static void main(String[] args) {
		
		
		String[] arr= {"Rainy","Summer","Snow","Spring","Fall","Winter","Hot"};
		
		System.out.println("\n*** String and length ***\n");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("String is: "+arr[i]+" and length is: "+arr[i].length());
		}
		
		
		System.out.println("\n*** Odd length String Using for loop ***\n");
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i].length() % 2 !=0)
			{
				System.out.println("Odd Length String is: "+arr[i]+ " Length is: "+arr[i].length());
			}
		}
		
		System.out.println("\n*** Odd length String Using while loop ***\n");
		
		int i=0;
		
		while(i<arr.length)
		{
			
			//System.out.println("String is: "+arr[i]+" Length is: "+arr[i].length());
			
			if(arr[i].length() % 2 !=0)
			{
				System.out.println("Odd Length String is: "+arr[i]+ " Length is: "+arr[i].length());
			}
			
			i++;
		}

	}

}


/*  

O/P -


*** String and length ***

String is: Rainy and length is: 5
String is: Summer and length is: 6
String is: Snow and length is: 4
String is: Spring and length is: 6
String is: Fall and length is: 4
String is: Winter and length is: 6
String is: Hot and length is: 3

*** Odd length String Using for loop ***

Odd Length String is: Rainy Length is: 5
Odd Length String is: Hot Length is: 3

*** Odd length String Using while loop ***

Odd Length String is: Rainy Length is: 5
Odd Length String is: Hot Length is: 3


*/