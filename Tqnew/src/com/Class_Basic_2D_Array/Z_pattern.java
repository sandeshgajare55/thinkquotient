package com.Class_Basic_2D_Array;

import java.util.Scanner;

public class Z_pattern {
	public static void main(String args[]) {
		int A[][] = new int[3][3];
		int k = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Elements of Array A : ");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
	}
}

