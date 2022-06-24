package com.Class_Basic_1D_Array;

import java.util.Arrays;

public class Array_reverse {
	public static void main(String ar[]) {
		char C[] = { 'A', 'B', 'C', 'D' };
		int size = C.length;
		char D[] = new char[size];
		// System.out.println(size);
		System.out.println("Elements of Array : ");
		for (int i = 0; i < C.length; i++) {
			System.out.print(" " + C[i]);
		}
		System.out.println();
		int j = C.length - 1;
		System.out.println("Reverse elements in same Array : ");
		for (int i = 0; i < size / 2; i++) {
			char temp = C[i];
			C[i] = C[j];
			C[j] = temp;
			j--;
			// System.out.println(" " + C[i]);
		}
		System.out.println(Arrays.toString(C));
		System.out.println("Reverse elements of Array in 2nd Array : ");

		for (int i = 0; i < C.length; i++) {
			D[i] = C[i];
			System.out.print(" " + D[i]);
		}

	}

}
