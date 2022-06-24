package com.Class_Basic_1D_Array;

public class Array_neg {

	public static void main(String ar[]) {
		int A[] = { 4, 10, 7, 2, 17, 5 };

		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				System.out.print(" " + A[i] * A[i]);
			} else if (A[i]% 2 != 0)

				System.out.print(" -" + A[i]);
		}

	}
}
