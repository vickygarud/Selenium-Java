package Day_Dec14;

public class Replace2ndOccString {

	public static void main(String[] args) {
		
		String str="sky is blue, tree is green";
		int cnt=0;
		
		
		//String st1= str.substring(0,1)+'z'+str.substring(1+1); //  
		
		//System.out.println(st1);
		String st1="";
		for(int i=0; i<str.length(); i++)
		{
			 char ch=str.charAt(i);
			
			 if(ch=='i' || ch=='i')
			 {
				 cnt++;
			 }
			 
			 if(cnt==2)
			 {
				 st1= str.substring(0,i)+'f'+'k'+str.substring(i+2);
				 cnt++;
			 }
			
		}
		
		  System.out.println(st1);
		

	}

}
/*
//String str = "I will be joining Google Inc by Mar 2022";
String str = "Want to be join Microsoft";

System.out.println("length: " + str.length());

//System.out.println(str.length()-4);// first occurrence of 2

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