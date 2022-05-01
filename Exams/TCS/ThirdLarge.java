package TCS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//import java.util.Arrays;

public class ThirdLarge {

	static void largeNo(int arr[], int no) {

		int nthLargest = no;

		if (nthLargest <= 0)
			nthLargest = 1;
		if (nthLargest > arr.length)
			nthLargest = arr.length;

		Arrays.sort(arr);
		int cnt = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				cnt++;
			}
			if (nthLargest == cnt) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		int no = 9;
		// int arr[]= new arr[no];
		int[] arr = { 6, 8, 9, 2, 43, 3, 5, 42, 15 };

		int n = 3;
		largeNo(arr, n);

		String str = "";

		List<Integer> values = Arrays.asList(3, 5, 1, 5, 2, 2, 5, 79, 54, 1);

		values.stream().distinct().forEach(s -> System.out.print(s));
		values.stream().distinct().forEach(s -> System.out.print(s));
		
		List <Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());	
		
		int cnt = 0;
		li.stream().forEach(a -> {
			if(a % 2 ==0)
			{
				System.out.println(a);
			}
		});
		
		

	}

}
