package com.Class_Basic_String;
import java.util.Scanner;
public class Words_count {
	public static void main(String args[])
	{
		String s = new  String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		s=sc.nextLine();	
		s=s.trim();
		
		String A[]=s.split(" ");
		System.out.println(A.length);
		
	}

}
