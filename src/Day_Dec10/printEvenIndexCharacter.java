package Day_Dec10;

public class printEvenIndexCharacter {

	public static void main(String[] args) {
		
		String s="abcdefghijklmnopqrstuvwxyz";
		
		for(int i=1; i<=s.length()-1; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(s.charAt(i)+" ");
				System.out.println(i);
			}
		}
		
		

	}

}
/*	
 c 2
e 4
g 6
i 8
k 10
m 12
o 14
q 16
s 18
u 20
w 22
y 24

 */


// Print character at even indexes from a given string

// Odd no- 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27

//Even no - 2 4 6 8 10 12 14 16 18 20  22  24  26 
//			0 1 2 3  4  5  6  7  8  9  10  11  12
//              c    e     g     i      k       m