package ArrayList;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("Hello");
		al.add(101);

		System.out.println(al);

		for (Object ob : al) {
			System.out.println(ob);
		}

		al.forEach((element) -> {
			System.out.println(element);
		});

		ArrayList<Integer> al1 = new ArrayList();

		//al1.get(0)
		al1.add(101);
		al1.add(201);
		al1.add(301);

		al1.stream();

		// al1.stream().filter(ans->ans.sum(10, 20));
		// Stream.of(null);

		long a = Stream.of("Jack", "Tom", "Robert", "Jane", "Alice").filter(name -> {
			name.startsWith("j");
			return true;
		}).count();

		System.out.println(a);

		ArrayList<String> ans = new ArrayList();

		ans.add("Jacck");
		ans.add("Tom");
		ans.add("Ryans");

		ans.stream().filter(len -> len.length() > 4).limit(2).forEach(name -> System.out.println(name));
		
		StringBuffer sss = new StringBuffer();
		
		String s1 ="first", s2 ="second", s3="third";
		
		System.out.println( s1.concat(s2).concat(s3));
		

	}

}
