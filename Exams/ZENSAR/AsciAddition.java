package ZENSAR;

public class AsciAddition {
	public static void main(String[] args) {
		
		//String str ="";
		String str = "Hi this is cpp tutorial";
		//String str = "Hi this is java tutorial";
		
		int sum=0;
		
		for(int i=0; i<str.length(); i++)
			
			sum = sum +str.charAt(i);
		
		System.out.println("Sum of all characters "+sum);
	}

}
