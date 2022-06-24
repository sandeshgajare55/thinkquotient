package com.Class_Basic_1D_Array;

import java.util.Scanner;

public class Array_demo {

	public static void main(String ar[]) {
		int a[] = new int[5];
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Array Elements : ");
		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = Sc.nextInt();
		}
		System.out.println("Elements : ");
		for (int i = 0; i <= 4; i++) {

			System.out.print(" " + a[i]);
			//System.out.println();
		}
		System.out.println();
		System.out.println("Length : " + a.length);
	}

}