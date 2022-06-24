package com.Class_Basic_String;

import java.util.Scanner;

public class String_operation_3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = sc.nextLine();
		s1.trim();
		String A[] = s1.split(" ");

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" " + A[j]);
			}
			System.out.println();
		}

	}

}
