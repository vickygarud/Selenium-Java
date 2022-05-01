package WIPRO;

public class EvenFind {

	public static void main(String[] args) {
		
		String str = "33423968";
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) % 2 ==0)
			{
				System.out.print(str.charAt(i));
				
			}
			
		}
	}

}
