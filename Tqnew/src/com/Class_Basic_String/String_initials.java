package com.Class_Basic_String;

import java.util.Scanner;

public class String_initials {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Full Name : ");
		String s1=sc.nextLine();
		String str=" ";
		s1.trim();
		String A[]=s1.split(" ");
		for(int i=0;i<A.length-1;i++)
		{
				str=str+A[i].toUpperCase().charAt(0)+".";
		}
		String str1=A[A.length-1];
		//System.out.println(str1);
		String s2=" ";
		for(int i=0;i<str1.length();i++)
		{
			   if(i==0)
			   {
				   char c=Character.toUpperCase(str1.charAt(0));
				   s2=s2+c;
			   }
			   else
			   {
				  s2=s2+str1.charAt(i);
			   }
		}
		
		//System.out.println(s2);
		
		System.out.println(str+s2);
		
	}

}
