package com.Class_Basic_1D_Array;

import java.util.Scanner;

public class Even_elements {

	public static void  main(String ar[])
	{
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(" Elements of Arrays : ");
		for (int i = 0; i < a.length; i++) {
		System.out.print(" "+a[i]);
		}
		System.out.println();
		System.out.println(" Even Number of Arrays : ");
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0)
			{
				System.out.print(" "+a[i]);
			}
			}
		System.out.println();
		System.out.println(" Elements at Even position in Arrays : ");
		for (int i = 0; i < a.length; i++) {
			if(i%2==0)
			{
				System.out.print(" "+a[i]);
			}
			}
	}
}
