package com.Class_Basic_1D_Array;

import java.util.Scanner;

public class Char_demo {

	public static void main(String args[]) {
		char c[] = new char[5];
		int a = 2, b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Characters : ");
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.next().charAt(0);
		}

		for (int i = 0; i < c.length; i++) {
			b = 24;
			if (c[i] == 'Z' || c[i] == 'Y' || c[i] == 'z' || c[i] == 'y') {
				c[i] = (char) (c[i] - (char) b);
				System.out.print(" " + c[i]);
			} else if (c[i] >= 'A' && c[i] <= 'X' || c[i] >= 'a' && c[i] <= 'x') {
				c[i] = (char) (c[i] + (char) a);
				System.out.print(" " + c[i]);
			} else
				System.out.print(" " + c[i]);
		}
	}
}
