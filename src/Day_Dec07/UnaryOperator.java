package Day_Dec07;

public class UnaryOperator {

	public static void main(String[] args) {

		int i = 10;
		i++;  // i = i + 1 post incr
		System.out.println(i);  				// 11
		++i;   //i = i + 1 pre incr
		System.out.println(i); 					//12
		
// i 12	
		
		System.out.println("++i : "+ ++i);		// ++i : 13
		System.out.println("i   : "+ i);		//i    : 13
		
// i 13		

		System.out.println("++i : "+ i++);		// ++i : 13
		System.out.println("i   : "+ i);  		//i    : 14
		
		
		int c;
		c = 10 + i++;  
		System.out.println("c : " + c); 		//C : 24
		System.out.println("i : " + i); 		//i : 15
		
		// i 15
		System.out.println(++i + i++);   		// 32
		System.out.println("i : " + i);			//i : 17
		// 32
		// 30
		
		
		
		System.out.println(" for loop ===========>");
		for(i=1;i++<=5;i++)
			System.out.println(i);
		
		System.out.println(" for loop ===========>");
		for(i=1;++i<=5;i++)
			System.out.println(i);
		

	}

}
