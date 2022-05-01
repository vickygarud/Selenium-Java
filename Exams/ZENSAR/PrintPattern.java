package ZENSAR;

public class PrintPattern {

	public static void main(String[] args) {

		int odd = 3;
		int cnt = 1;
		int no=7;

		for (int i = 1; i <= no; i++) {

			for (int j = 1; j <= cnt; j++) {
				System.out.print(odd);
			}
			System.out.println();
			if (i >= (no/2)+1) {
				odd--;
				cnt--;
			} else {
				odd++;
				cnt++;
			}

		}

	}

}

/*

3
44
55
6666
555
44
6 
 */ 
  
 