// ************ WORKING  ***********

package Day_Dec10;

public class ConsonantCountString {
	
	
	static void toCountVowels(String str, String vowels )
	{
		String str1=str.toLowerCase();
		
		System.out.println("Vowels Count: ");
		for(int i=0; i<vowels.length(); i++)
		{
			int vow=0;
			for(int j=0; j<str1.length(); j++)
			{
				
				if(vowels.charAt(i)==str1.charAt(j))
				{
					vow++;
				}
			}
			
			System.out.println(vowels.charAt(i)+" Occurs: "+vow);
		}
		
	}
	static void toCountConsonant(String str, String vowels )
	{
		String str1=str.toLowerCase();
		
		System.out.println("\nConsonant Count: ");
		
			
			for(int j=0; j<str1.length(); j++)
			{
				int con=0;
				if(str1.charAt(j)!= 'e' && str1.charAt(j)!= 'a' && str1.charAt(j)!= 'i' && 
			       str1.charAt(j)!= 'o' && str1.charAt(j)!= 'u' && str1.charAt(j)!= ' ')
				{
					con++;
					System.out.println(str.charAt(j)+" Occurs: "+con);
				}
				
				 //else
				 //System.out.println(str.charAt(j)+" Occurs: "+con); }
				
			}
		
	}
	

	public static void main(String[] args) {
		
		
		String str="World is Awesome w";
		String vowels ="aeiou";
		
		toCountVowels(str,vowels);
		toCountConsonant(str,vowels);
		
		
		
		/*
		 * System.out.println("Number of Vowels = " + vow + "\nNumber of Consonants = "
		 * + con);
		 */
			
	}

}
// B, C, D, F, G, H, J, K, L, M, N, P, Q, R, S, T, V, W, X, Y, and Z.