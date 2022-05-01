package MaxNo;

public class MaxNos {

	public static void main(String[] args) {

		// m = 300;
		int a = 32100, b = 100, c = 5030, d = 10000;

		int max = a > b ? a : b;
		System.out.println(max);

		System.out.println(Integer.max(a, b));

		max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

		System.out.println(max);

		max = (a > b && a > c && a > d) ? a : ((b > c && b > d) ? b : (c > d ? c : d));

		System.out.println(max);

		 max = (a > b && a > c && a > d) ? a : (b > c && b > d) ? b : (c > d) ? c : d;
	System.out.println(max);
	}

}
