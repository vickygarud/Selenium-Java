package Logical_Codes;

import java.util.HashSet;

public class CountArmstrongNumbers {

	public void m1() {

		System.out.println("My name is Vicky Garud and I am software test enginear");

		String str = "My name is Vicky Garud and I am software test enginear";

		String str1[] = str.split(" ");

		System.out.println(str1[3] + " " + str1[8]);

	}

	public static void main(String[] args) {

		CountArmstrongNumbers ob = new CountArmstrongNumbers();
		ob.m1();

		int arr[] = { 20, 30, 20, 30, 50 };

		HashSet hs = new HashSet();

		hs.hashCode();

		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}

		System.out.println(hs);

	}

}

/*
 * 
 * 20,30,20,30,50
 * 
 */