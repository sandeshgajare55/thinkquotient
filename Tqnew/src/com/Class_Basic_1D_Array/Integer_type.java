package com.Class_Basic_1D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Integer_type {

	
	public void Display(int...a)
	{
		System.out.println("Var arg Method : ");
		for(int b:a)
		{
			System.out.print(" "+b);
		}
		System.out.println();
	}
	public static void main(String ar[]) {
		Integer_type I = new Integer_type();
		I.Display(100,200,300);
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		I.Display(a);
		System.out.println("Using simple for loop : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]);
		}
		System.out.println();
		System.out.println("Using  enhanced for loop : ");
		
		for (int b : a) {
			System.out.print(" "+b);
		}
		System.out.println();
		System.out.println("Using (Arrays) Method : ");
			System.out.print(Arrays.toString(a));
		
		
	}
}
