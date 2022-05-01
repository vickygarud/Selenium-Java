package Day_Dec10;

public class VowelsCountString {

	public static void main(String[] args) {
		
		
		String str="World is Awesome";
		String vow="AEIOUaeiou";
		
		char ch;
		int j=0;
		int cnt=0;
		while(j<vow.length())
		{
			ch=vow.charAt(j);   //  ch=A | ch=E
			cnt=0;
			for(int i=0; i<str.length(); i++)
			{
				if(ch==str.charAt(i)) // A==A  | E==
				{
					cnt++;
				}
				
			}
			
			if(cnt>0)  
				System.out.println(ch+" Occurs: "+cnt+" Times");
			
			j++;
			
			
		}
		
	}

}

/*	
A Occurs: 1 Times
e Occurs: 2 Times
i Occurs: 1 Times
o Occurs: 2 Times

 */


// Vowels = A E I O U a e i o u
//Consonant
// A  
// 0

// H e l l o w  W o r l   d
// o 1 2 3 4 5  6 7 8 9  10
