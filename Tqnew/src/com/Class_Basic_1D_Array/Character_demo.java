package com.Class_Basic_1D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Character_demo {
	
	public void Display(char...a)
	{
		System.out.println("Var arg Method : ");
		for(char b:a)
		{
			System.out.print(" "+b);
		}
		System.out.println();
	}
	public static void main(String args[]) {
		Character_demo cd= new Character_demo();
		cd.Display('m','n','o');
		char c[] = new char[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Characters : ");
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.next().charAt(0);
		}
		cd.Display(c);
		System.out.println("Using simple for loop : ");
		for (int i = 0; i < c.length; i++) {
			System.out.print(" " + (c[i]));
		}

		System.out.println();
		System.out.println("Using  enhanced for loop : ");

		for (char d : c) {
			System.out.print(" " + d);
		}
		System.out.println();
		System.out.println("Using (Arrays) Method : ");
		System.out.print(Arrays.toString(c));
	}
}
