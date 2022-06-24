package com.Class_Basic_1D_Array;

public class Occurance {

	public static void main(String args[]) {
		int A[] = { 2, 5, 2, 1, 1, 1, 5 };

		for (int i = 0; i < A.length; i++) {
			int cnt = 1;
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
						cnt++;

					}
				}
				System.out.println(A[i] + " present " + cnt);
			}
		}
	}
}
