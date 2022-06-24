package com.Class_Basic_1D_Array;

public class Cases_demo {
	public static void main(String args[]) {
		char A[] = { 'a', 'Q', 'r', 't', 'D' };

		for (int i = 0; i < A.length; i++) {
			if (A[i] >= 'A' && A[i] <= 'Z') {
				A[i] = (char) (A[i] + (char) 32);
			} else if (A[i] >= 'a' && A[i] <= 'z') {
				A[i] = (char) (A[i] - (char) 32);
			}

			System.out.print(" " + A[i]);
		}

	}

}
