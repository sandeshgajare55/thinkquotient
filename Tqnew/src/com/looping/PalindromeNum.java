package com.looping;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check whether its palindrome or not");
		int no=sc.nextInt();
		int rev=0,rm,orinum;
		orinum=no;
		     
		for(int i=1;no!=0;i++)
		     {
		    	 rm=no%10;
		    	 rev=rev*10+rm;
		    	 no/=10;
		    	 
		     }
			
			if(orinum==rev)
			{
				System.out.println("Number is Palindrome");
	
			}
			else
				System.out.println("Number is Not a Palindrome");
	}

}
