package com.Class_Basic_1D_Array;

public class Duplicate_demo {
	public static void main(String args[]) {
		int A[] = { 10, 1, 10, 20, 50, 50,100,100 };
		for (int i = 0; i < A.length; i++) {
			boolean b = false;
			for (int k = i - 1; k >= 0; k--) {
				if (A[i] == A[k]) {
					b = true;
					break;
				}
			}
			if (b == false) {
				for (int j = i + 1; j < A.length; j++) {
					if (A[i] == A[j]) {
						System.out.println(A[i]);

					}
				}
			}
		}
	}
}