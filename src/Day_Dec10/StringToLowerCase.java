package Day_Dec10;

public class StringToLowerCase {
	
	public static void main(String[] args) {
		
		String s="One Day I Wil Win";
		
       System.out.println(System.identityHashCode(s));
       String s1=s.toLowerCase();
       System.out.println(System.identityHashCode(s1));
       
       System.out.println(s1);
       
       String s2=s.toUpperCase();
       System.out.println(s2);
       
      
	}

}

/*	

474675244
305808283
one day i will win

*/