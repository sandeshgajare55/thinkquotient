package com.Class_Basic_2D_Array;

import java.util.Scanner;

public class Addition_arrays {

	public static void main(String args[]) {
		int A[][] = new int[2][2];
		int B[][] = new int[2][2];
		int ADD[][] = new int[2][2];
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Elements of Array A : ");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the Elements of Array B : ");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				B[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				ADD[i][j] = A[i][j] + B[i][j];
			}
		}
		System.out.println("Addition of Elements of Array A and B : ");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				System.out.print(" " + ADD[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				sum = sum + A[i][j];
			}
		}
		System.out.println(sum);

	}
}
