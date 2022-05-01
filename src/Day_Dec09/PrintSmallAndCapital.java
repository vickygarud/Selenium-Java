package Day_Dec09;

public class PrintSmallAndCapital {

	public static void main(String[] args) {
		
		String s="ABCDEFGHIJLMNOPQRSTUVWXYYZ";
		
		for(int i=0; i<=s.length()-1; i++)
		{
			s.charAt(i);
			
			//ch=s.toLowerCase();
		String s1=s.toLowerCase();
		String s2=s.toUpperCase();
		//System.out.println(s2+" ");
		System.out.println(s1+" "+s2);	
		
		
			
		}

	}

}


// print small a then capital A, b,B,cC...zZ
