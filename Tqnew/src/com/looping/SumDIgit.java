package com.looping;

import java.util.Scanner;

public class SumDIgit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to print its Digit`s sum");
		int num=sc.nextInt();
		int temp=0;
		int sum=0;
		 
	/*	while(num!=0)
		  {
			  temp=num%10;
			  sum=sum+temp;
			  num/=10;
		  }*/
		
		for(int i=0;num!=0;i++)
		{
			temp=num%10;
			  sum=sum+temp;
			  num/=10;
		}
		
		System.out.println("Addition of each Digit of a Number: "+sum);
	}

}
