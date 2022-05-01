package Day_Dec10;

public class DoubleCharPrint {

	public static void main(String[] args) {
		
		
		String s = "Rohit";
		System.out.println(s + s);
			
		char ch;
		for(int i=0;i<s.length();i++)
		{
			ch = s.charAt(i);
			System.out.print(ch + "" + ch+" ");
		//	System.out.print(ch+ch);
		}
	System.out.println();
		
		System.out.println("s = " + s + "  address= " + System.identityHashCode(s));
		
		
		System.out.print("\n");
		System.out.println(s.concat(" Sharma"));
		
		System.out.println("s = " + s + "  address= " + System.identityHashCode(s));

		s=s.concat(" Sharma");
		System.out.println("s = " + s + "  address= " + System.identityHashCode(s));
	}

}

/* O/P- 
RohitRohit
RR oo hh ii tt 
s = Rohit  address= 359023572

Rohit Sharma
s = Rohit  address= 359023572
s = Rohit Sharma  address= 305808283

*/