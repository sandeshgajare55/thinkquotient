package com.Class_Basic_String;

import java.util.Scanner;

public class String_operation {
	public static void main(String args[]) {
		String S = new String();
		String word = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		S = sc.nextLine();
		String S2 = S;
		S2.trim();
		String A[] = S2.split(" ");
		System.out.println("Original String : " + S2);
		StringBuffer sb = new StringBuffer(S);
		sb.reverse();
		S = sb.toString();
		System.out.println("Reverse String : " + S);
		for (int i = A.length - 1; i >= 0; i--) {

			word += A[i]+" ";
		}
		System.out.println("Reversed Words : "+word);
		
		System.out.println(S2.substring(3,7));
	}

}
