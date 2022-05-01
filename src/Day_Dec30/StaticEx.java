package Day_Dec30;

public class StaticEx {
	
	
	int a;		// non - static variable
	static int x;
	static int y=50;
	
	static void print(int b)				// static method
	{
		System.out.println("To print a value "+b);
	}
	
	
	 void display()
	{
		System.out.println(StaticEx.y);
		System.out.println();
		System.out.println("To print a value 2nd method "+StaticEx.x);
	}

	public static void main(String[] args) {
		
		print(10);
		
	StaticEx ob = new StaticEx();
		
	
		
		

	}

}
