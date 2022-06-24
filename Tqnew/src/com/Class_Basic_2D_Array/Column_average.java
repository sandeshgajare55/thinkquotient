package com.Class_Basic_2D_Array;

import java.util.Scanner;

public class Column_average {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A[][] = new int[2][2];
		int B[][] = new int[2][2];
		int CA[][] = new int[2][2];
		int sum = 0,cnt=0;
		System.out.println("Enter the Elements of Array A : ");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				System.out.print(" "+A[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				sum = sum + A[i][j];
				cnt++;
			}
		}

		int avg = sum / A.length;
		//System.out.println(A.length);
		System.out.println("Sum : " + sum);
		System.out.println("AVg : " + avg);
	}
}
