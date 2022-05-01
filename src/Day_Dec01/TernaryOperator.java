package Day_Dec01;

public class TernaryOperator {
	
	public static void main(String[] args) {
		int a = 80, b = 40, c = 50;
		
		int large = (a > b) ? (a > c ? a:b ) : ( (b > c) ? b:c);
		
		System.out.println(large);
		
		int  w= 80, x = 40, y = 50, z = 100;
		
		int max = (w > x && w > y && w > z ) ? 
				w: ( (w > y && y > z) ?	x: (y > z ? y:z ) );
		
		System.out.println(max);
		
		
		
		
		int p = 10, q =50, r = 100;
		
		int ans = (p > q) ? ( p > r ? p:r) : ( (q > r) ? q:r);
		
		System.out.println("Answer : "+ans);
	}

}