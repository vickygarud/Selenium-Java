package SortObject;

import java.util.ArrayList;
import java.util.Collections;

public class Hsbc {

	public static void main(String[] args) {

		ArrayList<Emp> al = new ArrayList<Emp>();

		al.add(new Emp(51, "Jack"));
		al.add(new Emp(31, "Tom"));
		al.add(new Emp(21, "Ryan"));
		al.add(new Emp(11, "Chris"));

		// System.out.println(al);

		for (Emp ob1 : al) {
			System.out.println(ob1.empNo + " " + ob1.empName);
		}

		Collections.sort(al);
		System.out.println("\nSorted Object: ");

		for (Emp ob1 : al) {
			System.out.println(ob1.empNo + " " + ob1.empName);
		}

	}

}
