package com.tqbasic;

import java.util.Scanner;

public class NumberCheck {
	
	
	public static void main(String ar[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number to chech whether its Positive,Negative,Zero : ");
		int a=s.nextInt();
		
		if(a<0)
		{
			System.out.println("The Number is "+a+" Negative");
		}
		else if(a>0)
		{
			System.out.println("The Number is "+a+" Positive");
		}
		else
			System.out.println("The Number is Zero");
	}

}
