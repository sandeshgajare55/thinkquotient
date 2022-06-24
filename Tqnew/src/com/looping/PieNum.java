package com.looping;

import java.util.Scanner;

public class PieNum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to find whether its Pie number : ");
		int num=sc.nextInt();
		int t,sum=0,mul=1;
		
		  while(num!=0)
		  {
			  t=num%10;
			  sum=sum+t;
			  mul=mul*t;
			  num/=10;
		  }
		  
		  System.out.println("Addition of Digits : "+sum);
		  System.out.println("Multiplication of Digits : "+mul);
		  
		  	if(sum==mul)
		  	{
		  		System.out.println("----Entered Number is Pie---- ");
		  	}
		  	else
		  		System.out.println("Entered Number is not a Pie Number");
	}

}
