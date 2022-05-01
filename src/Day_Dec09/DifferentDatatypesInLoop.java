package Day_Dec09;

public class DifferentDatatypesInLoop {

	public static void main(String[] args) {

		
		 for(double f=1.0f; f<20.0; f+=0.10)
			 System.out.println(f + " "); //10.0 10.1 10.2
		   //10.3 11.0
		 
		/*
		for(char i=97; i<=(97+25);i++)
			System.out.println(i);
		
		*/
		
	/*
		// find ASCII value of any char
		char ch = '0';// $#' ',0-9, A-Z a-z
		System.out.println((int) ch);
	
		
		String str = "Cyber"; // heap memory/ SCP String Constant Pool
		System.out.println(str+"   str Memory Address : " +System.identityHashCode(str));
		
		String str2="Cyber";
		System.out.println(str2+"   str2 Memory Address: "+System.identityHashCode(str2));
		
		
		String str1 = new String("Cyber");  // creates new object
		System.out.println(str1+"   str1 Memory Address: "+System.identityHashCode(str1));

	*/
   }

}

// 97 + 25 = 122

//a 