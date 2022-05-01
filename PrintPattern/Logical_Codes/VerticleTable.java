package Logical_Codes;

public class VerticleTable {

	public static void main(String[] args) {
		
		
		for(int i=1; i<=10; i++)
		{
			
			for(int j=2; j<=10; j++)
				System.out.print(String.format("%-4d", (j*i)));
			System.out.println();
		}

	}

}

/*  

   2   3   4   5   6   7   8   9  10
   4   6   8  10  12  14  16  18  20
   6   9  12  15  18  21  24  27  30
   8  12  16  20  24  28  32  36  40
  10  15  20  25  30  35  40  45  50
  12  18  24  30  36  42  48  54  60
  14  21  28  35  42  49  56  63  70
  16  24  32  40  48  56  64  72  80
  18  27  36  45  54  63  72  81  90
  20  30  40  50  60  70  80  90 100


*/
