package com.Class_Basic_String;

import java.util.Scanner;

public class Count {
	public static void main(String args[]) {
		String s = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		s = sc.next();
		int cnt=0;

		for (int i = 0; i < s.length(); i++) {
			System.out.print(" "+s.charAt(i));
			cnt++;
		}
		System.out.println();
		System.out.println("Count of Characters in String : "+cnt);
	}

}
