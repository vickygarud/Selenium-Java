package WIPRO;





import java.util.Scanner;

public class Shraddha3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[8];
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (temp < arr[i])
				temp = arr[i];
		}

		System.out.println(temp);

		sc.close();
	}

}
