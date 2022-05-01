package Day_Dec10;

public class StrinngReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="123456789";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i)+" ");
		}
		System.out.println();
		
		String str="Hellow World";
		System.out.println(str);
		
		for(int i=str.length()-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
		
	
	}

}

// i=10; i>=0; i--


// print number in reverse order. Eg: number=123, expected output: 321

// O/P - 9 8 7 6 5 4 3 2 1 	