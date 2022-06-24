package com.Class_Basic_1D_Array;

public class Odd_Even_Array {

	public static void main(String ar[]) {
		int Num[] = { 5, 2, 11, 7, 4, 7 };
		int size = Num.length;
		int Odd[] = new int[size];
		int Even[] = new int[size];
		int e = 0;
		int o = 0;
		System.out.println("Original Array : ");
		for (int i = 0; i < size; i++) {
			System.out.print(" " + Num[i]);
		}
		System.out.println();
		System.out.println("From Even  ");
		for (int i = 0; i < size; i++) {
			if (Num[i] % 2 == 0) {
				Even[e] = Num[i];
				e++;
			}
		}
		for (int i = 0; i < e; i++) {
			System.out.print(" " + Even[i]);
		}
		System.out.println();
		System.out.println("Even count " + e);

		System.out.println("From Odd :");
		for (int i = 0; i < size; i++) {
			if (Num[i] % 2 != 0) {
				Odd[o] = Num[i];
				o++;
			}
		}
		for (int i = 0; i < o; i++) {
			System.out.print(" " + Odd[i]);
		}
		System.out.println();
		System.out.println("Odd count " + o);

		// System.out.println(o);

	}

}
