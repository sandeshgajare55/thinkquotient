package com.tqbasic;

import java.util.Scanner;

public class AreaRect {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Length and Breadth of a Rectangle : ");
		int l=s.nextInt();
		int b=s.nextInt();
		
		int a=l*b;
		
		System.out.println("Area Of Rectangle : "+a);
		
		
	}

}
