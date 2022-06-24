package com.Class_Basic_String;

import java.util.Scanner;

public class Methods {
	public static void main(String ar[]) {
		String s = new String();
		String g = " Gajare";
		String t = "Sandesh";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String : ");
		s = sc.next();
		System.out.println("Original String : " + s);
		System.out.println("Length : " + s.length()); // method which returns length of string
		System.out.println("Uppercase : " + s.toUpperCase());// convert lowercase to uppercase
		System.out.println("Lowercase : " + s.toLowerCase());// convert uppercase to lowercase
		System.out.println("Replace specific  : " + s.replace('a', 'O'));// replace a particular char with another one
		System.out.println("Value of : " + s.valueOf(78));
		System.out.println("Ends with  : " + s.endsWith("esh"));// return boolean value if ends with particular string
		System.out.println("Starts with : " + s.startsWith("esh"));// return boolean value if starts with particular
																	// string
		System.out.println("Substring : " + s.substring(4));// gives string from particular index
		System.out.println("Substring 2 : " + s.substring(3, 7));// gives string between 2 index
		System.out.println("Concat : " + s.concat(g));// connects two strings;
		System.out.println("Isempty : " + s.isEmpty());// return boolean value
		System.out.println("Contains : " + s.contains("nd"));// returns true value if sequence of string is present
		System.out.println("Char At : " + s.charAt(3));// return char at a position
		System.out.println("Split : " + s.split(s));// spilt the string
		System.out.println("Compare to  : " + s.compareTo(t));// return numeric value by comparing
		System.out.println("Compare to Ignore case : " + s.compareToIgnoreCase(t));// ignoring case of string
		if (s.equals(t)) {
			System.out.println("Is Equal : yes");
		}
		char[] C = s.toCharArray();//
		for (int i = 0; i < s.length(); i++) {
			System.out.print(" " + C[i]);
		}
	}

}
