package com.Class_Basic_String;

import java.util.Scanner;

public class String_palindrome {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1=sc.nextLine();
		StringBuilder sb = new StringBuilder(s1);
		String r=sb.toString();
		
		if(s1.equals(r))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not a Palindrome");
	}

}
