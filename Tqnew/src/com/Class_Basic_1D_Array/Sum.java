package com.Class_Basic_1D_Array;

import java.util.Scanner;

public class Sum {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int sum = 0;
		System.out.println("Enter the elements : ");
		for (int i = 0; i <a.length; i++) {
			 a[i]=sc.nextInt();
		}
		for (int i = 0; i <a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of all elements in Array : " + sum);
	}

}
