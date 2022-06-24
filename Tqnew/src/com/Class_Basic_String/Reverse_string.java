package com.Class_Basic_String;

import java.util.Scanner;

public class Reverse_string {
	public static void main(String args[]) {
		String str = new String();
		StringBuffer sb = new StringBuffer(str);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String Reverse it : ");
		str = sc.next();
		System.out.println("Original String : " + str);
		char[] A = str.toCharArray();
		System.out.print("Reversed String : ");
		for (int i = A.length - 1; i >= 0; i--)
			System.out.print(A[i]);
	}
}
