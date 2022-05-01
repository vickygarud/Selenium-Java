package Day_Dec02;

public class MemoryAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 23;
		System.out.println("age = "+ age);
		int ma = System.identityHashCode(age);
		System.out.println(ma);
												// System: class name
	                                        	// identityHashCode: function/method who display memory address on variable
		
		//1993134103
		//1993134103
		//1993134103
		
		float f = 12.34f;
		System.out.println("float f ma : " + System.identityHashCode(f));  // f=305808283
		
		double d = 56.4;
		System.out.println("double d ma : " + System.identityHashCode(d)); // d= 2111991224
		
		
		String city = "Pune"; 								
		
		System.out.println("city: " + city);
		System.out.println("city ma : " + System.identityHashCode(city));   ////city = 1130478920
		
		
		
		String village = "Pune";											
		
		
		
		System.out.println("village    : " + village);
		System.out.println("village ma : " + System.identityHashCode(village));  //village= 1130478920
		
		String town = "Pune";
		System.out.println("town: " + town);
		System.out.println("town ma : " + System.identityHashCode(town));   ////town= 1130478920

		
		/* In String if variable value is exactly same then in java it address the same memory
		if we create String using new keyword then jvm allocate new dedicated memory address */		
		
		

		String country1 = new String("Pune");
																						// String is a class
																						// reference variable country
																						// memory : new String : object 
																						// value assignment : India
		
		System.out.println("country1: " + country1);
		System.out.println("Ma: " + System.identityHashCode(country1));  // country1= Pune=917142466
		
		String country2 = new String("USA");
		System.out.println("country2 : " + country2);
		System.out.println("ma: " + System.identityHashCode(country2));  // USA= 1993134103
		
		String country3 = new String("Pune");
		System.out.println("country3 : " + country3);
		System.out.println("ma: " + System.identityHashCode(country3)); // country = Pune= 405662939
		
		// == 
		// equals
		System.out.println("city    : " + city);
		System.out.println("village : " + village);
		// SCP
		if (city == village) // memory addresses 
			System.out.println("Both strings are SAME");
		else
			System.out.println("Both strings are NOT SAME");
		
		if (city.equals(village))   // content  
			System.out.println("Both city and country strings are SAME");
		else
			System.out.println("Both city and country strings are NOT SAME");
		
		// Here variable city and village has same value and same memory the o/p is string same
			
		
		if (country1 == country3)  		// 	String country1 = new String("Pune"); & 	String country3 = new String("Pune");
			
			System.out.println("== country1 is SAME as country3");
		else
			System.out.println("== country1 is NOT SAME as country3");
			
		if (country1.equals(country3))
			System.out.println("equals: country1 is SAME as country3");
		else
			System.out.println("equals: country1 is NOT SAME as country3");
		
		city = "Kolhapur";
		
		
		//Here in variable counrty1 & country2 has different memory address so o/p is Not Same if we us == operator 
		// and if we use ".equals" method variable counrty1 & country2 has same value so it shows same String
		//if change value the java will create new memory address
		
		//final String city1 = "Pune";
		// 	city1= "Kolhapur";

	}

}
