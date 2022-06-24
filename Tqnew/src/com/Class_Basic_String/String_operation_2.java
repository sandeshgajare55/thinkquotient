package com.Class_Basic_String;

import java.util.Scanner;

public class String_operation_2 {
	public static void main(String args[]) {
		String S = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		S = sc.nextLine();
		String str = S;
		String word = " ";
		char ch[] = S.toCharArray();
		String rev = " ";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}
		System.out.println(rev);

		str.trim();
		String[] A = str.split(" ");

		for (int i = 0; i < A.length; i++) {
			for (int j = A[i].length() - 1; j >= 0; j--) {
				System.out.print(A[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();

	}

}
