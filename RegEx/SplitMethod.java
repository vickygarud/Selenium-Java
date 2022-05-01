
public class SplitMethod {
	
	public static void main(String[] args) {
		
		String str1 = "Hello 'java' program";
		
		String str2 = str1.substring(str1.indexOf("'")+1 , str1.indexOf("'",str1.indexOf("'")+1));
		
		System.out.println(str2);
		String str4 = "12345";
		System.out.println(str4.substring(0,str4.length()));
	}

}
