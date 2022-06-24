package com.Class_Basic_2D_Array;

public class Array_outter {

	public static void main(String args[]) {
		int A[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (i == 0 || i == A.length-1||j==0||j==A.length-1) {
					System.out.print("  " + A[i][j]);
				}
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}
