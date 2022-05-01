package Day_Dec14;

//import java.util.HashMap;
//import java.util.Map;
import java.util.regex.Pattern;

	public class ReverseWords1 {
		// Method to reverse words of a String
	    static String reverseWords(String str)
	    {
	  
	        //  The string \s is a regular expression that means "whitespace", and 
	    	//you have to write it with two backslash characters ("\\s") when writing 
	    	//it as a string in Java.
	    	/* that expression will split the string into substrings where the substrings are separated by whitespace characters. */
	    	
	        Pattern pattern = Pattern.compile("\\s");
	  
	        // splitting String str with a pattern
	        // (i.e )splitting the string whenever their
	        //  is whitespace and store in temp array.
	        //System.out.println(str.length());
	        String[] temp = pattern.split(str);
	       // System.out.println(temp.length);
	        String result = "";
	  
	        // Iterate over the temp array and store
	        // the string in reverse order.
	        for (int i = 0; i < temp.length; i++)
	        {
	            if (i == temp.length - 1)		//   2==2 
	                result = temp[i] + result;	//  earth  
	            else
	                result = " " + temp[i] + result;  //earth  to  Welcome                           //   Welcome    to      earth
	        }											                                        //   0         1         2
	        return result;
	    }
	    
	    static void reverse(String str)
	    {
	    	
	    	String[] temp = str.split("\\s");
	    	String print="";
	    	for(int i=temp.length-1; i>=0; i--)
	    	{
	    		System.out.print(temp[i]+" ");	
	    		 print = print+temp[i]+" ";
	    	}
	    	//System.out.println("\n"+print);
	    }
	    
	  
	    // Driver methods to test above method
	    public static void main(String[] args)
	    {
	        String s1 = "Welcome to earth";
	        System.out.println(reverseWords(s1));
	  
	        String s2 = "I love Java Programming";
	        System.out.println(reverseWords(s2));
	        
	        
	        reverse(s1);
	    }
	}

