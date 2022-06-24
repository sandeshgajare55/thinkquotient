package com.Class_Basic_2D_Array;

import java.util.Scanner;

public class Array_demo1 {

	public static void main(String ar[]) {

		int a[][] = new int[3][3];
		int b[][]= {{1,2,3},{4,5,6}};
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Elements : ");
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.print(" Elements : " + (a[i][j]));
			}
		}*/

		for (int i = 0; i <b.length; i++) {
			for (int j = 0; j <b[i].length; j++) {
				System.out.print("  " + (b[i][j]));
			}
		}

	}
}