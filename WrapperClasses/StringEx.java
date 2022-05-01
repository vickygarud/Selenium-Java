
public class StringEx {
	
	public static void main(String[] args) {
		
		String str = "45";
		
		int a = Integer.parseInt(str);
		int b = Integer.parseUnsignedInt(str, 8);
		
		//System.out.println(c);
		
		System.out.println(b);
		
		System.out.println(a);
		
	}

}
