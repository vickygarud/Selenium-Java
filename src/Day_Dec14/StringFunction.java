package Day_Dec14;

public class StringFunction {

	public static void main(String[] args) {
		
		
		String str="Even a pig can fly";
		String str1="if it stands at the center of a whirlwind";
		
		String res=str.concat(str1+"\n");
		
		System.out.println(res);
		
		
		res=String.join(" ", str, str1);
		System.out.println(res);
		
		res=str1.repeat(2);
		System.out.println(res);
		
		System.out.println();
	//	res=str.replace('pig', 'dog');
		res=str.replace('p', 's');
		System.out.println("str.replace('p', 's'): "+ res);
		
		System.out.println();
		
		res=str.replace("pig", "dog");
		System.out.println("str.replace(\"pig\", \"dog\"): "+res);
		
		
	}

}
