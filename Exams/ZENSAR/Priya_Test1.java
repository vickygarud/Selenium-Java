package ZENSAR;

public class Priya_Test1 {

	public static void main(String[] args) {

		String str = "45";

		String str1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			str1 = str1 + str.charAt(i);
		}

		int no = Integer.valueOf(str1);
		str1 = "";
		while (no != 0) {
			int r = no % 8;
			str1 = str1 + r;
			no /= 8;
		}

		System.out.println(str1);
		
		int max=0,min=0;

		int arr[] = { 4, 5, 2, 4, 6, 7, 95, 4, 3, 22 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i - 1; i++) {
				if (arr[i] > arr[j]) {
					 max = arr[i];
				     min = arr[i - 1];
				}
			}
		}
		
		System.out.println(max+"---"+min);

	}

}
