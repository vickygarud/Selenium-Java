package Day_Dec13;

public class StringFunctions {

	public static void main(String[] args) {

			/*
//			String str = "I will be joining Google Inc by Mar 2022";
			String str = "Want to be join Microsoft";
			
			System.out.println("length: " + str.length());
			
//			System.out.println(str.length()-4);// first occurrence of 2
			
			int res1 = str.indexOf(98);   // a : 97, b: 98
			int res2 = str.indexOf('b');  //'b'
			
			System.out.println("res1 :"+ res1);
			System.out.println("res2 :"+ res2);
			
			int res = str.indexOf('o', str.indexOf('o')+1);
			System.out.println("2nd occ res : "+ res);  // 2nd occ 19
			
			res = str.indexOf('o', res+1);
			System.out.println("3rd occ res : "+ res);  // 3rd occ 17
			
			res = str.indexOf('z');
			System.out.println("res = " + res);
			if (res == -1)
				System.out.println("character z does not exist");
			
			*/
			
			String s1="One day i will win, don't stop untill you proud ";
					   
			
			
			int r1=s1.indexOf(110);
			System.out.println(r1);
			
			r1=s1.indexOf('n');
			System.out.println(r1);
			
			r1=s1.indexOf('n', s1.indexOf('n')+1);
			System.out.println(r1);
			
			r1=s1.indexOf('n',r1+1);
			System.out.println(r1);
			
	}

}


/*   
O/P -
length: 22
2nd occ res : 9
3rd occ res : 17
res = -1
character z does not exist

*/