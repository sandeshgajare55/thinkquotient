package com.Class_Basic_String;

import java.util.Scanner;

public class String_largest_word {
	public static void main(String args[]) {
		String s = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		s = sc.nextLine();
		s.trim();
		String temp = " ";
		String A[] = s.split(" ");

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (A[i].length() > A[j].length()) {
					temp = A[i];
				}
			}
		}
		System.out.println("Word with Largest Length : " + temp);
	}

}
