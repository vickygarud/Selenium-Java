package Bangalore;

public class Sahil {

	static int highestPowerof2(int n) {

		int res = 0;
		for (int i = n; i >= 1; i--) {

			// If i is a power of 2
			if ((i & (i - 1)) == 0) {
				res = i;
				break;
			}
		}

		int p = (int) (Math.log(n) / Math.log(2));

		System.out.println(p);

		System.out.println(Math.log(2) + " " + (Math.log(n)));

		System.out.println((int) Math.pow(2, p));

		return res;
	}

	public static void main(String[] args) {
		int n = 100;

		System.out.print(highestPowerof2(n));

	}

}

/*
 * 
 * int p = (int)(Math.log(n) / Math.log(2)); return (int)Math.pow(2, p);
 * 
 */
