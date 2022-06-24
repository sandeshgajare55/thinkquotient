package com.tqbasic;

import java.util.Scanner;

public class Arthimaticopr {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the correct option 1.Addition,2.Subtraction,3.Multiplication,4.Division,5.Modulus");
		int exp=s.nextInt();
		int a,b;
		
		switch(exp)
		{
		case 1:
			System.out.println("Enter the Numbers to perform Addition operation : ");
			a=s.nextInt();
			 b=s.nextInt();
			 System.out.println("Addition : "+(a+b));
			break;
			
		case 2:
			System.out.println("Enter the Numbers to perform Subtraction operation : ");
			 a=s.nextInt();
			 b=s.nextInt();
			 System.out.println("Subtraction : "+(a-b));
			 break;
			 
		case 3:
			System.out.println("Enter the Numbers to perform Multiplication operation : ");
			a=s.nextInt();
			b=s.nextInt();
			System.out.println("Multiplication :"+(a*b));
			break;
			
		case 4:
			System.out.println("Enter the Numbers to perform Division operation : ");
			a=s.nextInt();
			b=s.nextInt();
			System.out.println("Division :"+(a/b));
			break;
			
		case 5:
			System.out.println("Enter the Numbers to perform Modulus operation : ");
			a=s.nextInt();
		    b=s.nextInt();
			System.out.println("Modulus :"+(a%b));
			break;
		}
s.close();
}
}
