package Day_Dec10;

public class CountLettersinString {

	public static void main(String[] args) {
		
		String s="Argentina is Advance Application";
		int sum=0;
		
		System.out.print("String is: ");
		
		for(int i=0; i<s.length(); i++) // 9 / 9-1/ 
		{
			System.out.print(s.charAt(i));
			
			if(s.charAt(i)=='A' || s.charAt(i)=='a')
			{
				sum=sum+1;
			}
		}
		
		System.out.println("\nNo of letter A occurs is: "+sum);

	}

}


// Count occurrence of a letter in a given string. Count occurrence of letter ‘A’ in Argentina


/* O/P 

String is: Argentina is Advance Application
No of letter A occurs is: 6

*/