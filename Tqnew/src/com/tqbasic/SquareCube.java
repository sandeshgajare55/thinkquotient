package com.tqbasic;

import java.util.Scanner;

public class SquareCube {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number to Print Square as well as Cube : ");
		int a=s.nextInt();
		
		int s1= a*a;
		System.out.println("Square of a Number : "+s1);
		
		int c1=(a*a*a);
		System.out.println("Cube of a Number : "+c1);
		
		

	}

}
