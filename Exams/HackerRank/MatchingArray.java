package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class MatchingArray {

	public static int sockMerchant(int n, List<Integer> ar) {
		// Write your code here

		int cnt = 0;
		for (int i = 0; i < ar.size(); i++) {
			for (int j = i + 1; j < ar.size() - 1; j++) {
				if (ar.get(i) == ar.get(j)) {
					cnt++;
					ar.remove(i);
					ar.remove(j);
					// System.out.println(cnt);
				}
			}
		}

		return cnt;

	}

	public static void main(String[] args) {

		int ar[] = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };

		List<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < ar.length; i++) {
			a.add(ar[i]);

		}

		int result = sockMerchant(9, a);

		System.out.println(result);
	}

}
