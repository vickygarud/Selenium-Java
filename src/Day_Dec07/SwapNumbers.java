package Day_Dec07;

public class SwapNumbers {

	public static void main(String[] args) {
	
		
		int a=5;
		int b=10;
		int t;
		
		System.out.println("Original Value: a="+a+" b="+b);
		
		t=a;
		a=b;
		b=t;
		
		System.out.println("Swap Values: a="+a+" b="+b);
		
		System.out.println();
		
		int x=20, y=30;
		
		System.out.println("Original Value: x="+x+" y="+y);
		
		x=x+y;   //x=-10
		//System.out.println(x);
		y=x-y;		//y= -10+30=20
		
		x=x-y;		//x=-10-20=30
			
		System.out.println("Swap Values: x="+x+" y="+y);
		

	}

}

/*

Original Value: a=5 b=10
Swap Values: a=10 b=5

Original Value: x=20 y=30
Swap Values: x=30 y=20

*/