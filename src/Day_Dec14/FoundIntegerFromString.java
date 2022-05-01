package Day_Dec14;

public class FoundIntegerFromString {

	public static void main(String[] args) {
		
		
		String str="computer23scie4nce";
		
		for(int i=0; i<str.length(); i++)
		{
			char ch= str.charAt(i);
			
			if(ch > '0' && ch < '9')
			 System.out.print(ch+" ");
			 
		}
		
		System.out.println();
	
		String st2="1234567890";
		String st1="";
		for(int i=0; i<st2.length(); i++)
		{
		     st1=st1+st2.charAt(i);
		   if(str.contains(st1))
		   {
			   System.out.print(st1+" ");
		   }
		
		   st1="";
		}
	
		
		
		

	}

}
