package Day_Dec15;

public class ArrayBasics {

	public static void main(String[] args) {
		
	int[] arr = new int[5];   // arr is a variable of type int array which will have 5 cells
		
		System.out.println("arr[0] =" + arr[0]);
		System.out.println("arr[1] =" + arr[1]);
		System.out.println("arr[2] =" + arr[2]);
		System.out.println("arr[3] =" + arr[3]);
		System.out.println("arr[4] =" + arr[4]);
		
		float[] arr1 = new float[5];   // arr is a variable of type int array which will have 5 cells
		
		System.out.println("arr1[0] =" + arr1[0]);
		System.out.println("arr1[1] =" + arr1[1]);
		System.out.println("arr1[2] =" + arr1[2]);
		System.out.println("arr1[3] =" + arr1[3]);
		System.out.println("arr1[4] =" + arr1[4]);
		
		// double default array value 0.0
		// boolean - false
		// char - space
		// short, byte, long - 0 
		// String - null
		
		
		System.out.println("====================");
		arr[0] = 100;
		arr[4] = 400;
		arr[3] = 1000;
		
		System.out.println("arr[0] =" + arr[0]);
		System.out.println("arr[1] =" + arr[1]);
		System.out.println("arr[2] =" + arr[2]);
		System.out.println("arr[3] =" + arr[3]);
		System.out.println("arr[4] =" + arr[4]);
		
		System.out.println("\n\n\n==============================");
		for(int i=1;i<5;i++)
			System.out.println(arr[i]);
		
		System.out.println("reverse array printing:");
		for(int i=4;i>=0;i--)
			System.out.println(arr[i]);
		
		System.out.println("arr.length: " + arr.length);
		
		
		int counter = 4;
		char[] chArr = new char[counter];
		int index=0;
		/*
		while(index<=chArr.length-1)
		{
			 System.out.println("chArr:" + chArr[index]);
			 index++;
		}
		*/
		index = 0;
		do
		{
			System.out.println("chArr:" + chArr[index]);
			index++;
		}
		while(index<chArr.length);
		System.out.println("===============");
		// for Each /Enhanced loop
		for(char   ch : chArr)   // can not access in reverse order
			System.out.println("ch="+ch); 
		System.out.println("==================");
		String[] str = new String[5];
		for(int i=0;i<str.length;i++)
			System.out.println(str[i]);  //null
		
		str[0] = "Orange";
		str[1] = "Red";
		str[2] = "Purple";
		str[3] = "Yellow";
		str[4] = "Blue";
		/*
		 * for(int i=0;i<str.length;i++) System.out.println(str[i]);
		 */
		for(String   s : str)
			System.out.println(s);
		
		System.out.println("*************");
		//reverse printing using  while
		int i = str.length-1; //4
		while(i>=0)
			System.out.println(str[i--]);
		 
		
	

	}

}
