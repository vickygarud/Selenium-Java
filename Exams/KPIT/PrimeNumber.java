package KPIT;

import java.util.ArrayList;

public class PrimeNumber {

	 static int findPrime(int min, int max) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = min; i <= max; i++) {
			int temp = i;
			int cnt = 0;
			for (int j = 1; j <= temp / 2; j++)
			{
				if (temp % j == 0)
					cnt++;
			}

			if (cnt == 1) {
				list.add(i);
			}
		}
		int diff = list.get(list.size() - 1) - list.get(0);
		
		return diff;
	}

	public static void main(String[] args) {

		int min = 10, max = 50;
		

		System.out.println(findPrime(min, max));
	}	

}
