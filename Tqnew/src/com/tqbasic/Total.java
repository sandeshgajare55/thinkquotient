package com.tqbasic;

import java.util.Scanner;

public class Total {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int a = 0;
		int next=num%10;
		num=num/10;
		boolean isincrease= true;
		
		while(num>0)
		{
			int prev=num%10;
			if(prev>next)
			{
				isincrease=false;
				break;
			}
			num/=10;
			prev=next;
		}
		
		if(isincrease==true)
		{
			System.out.println("Increasing number ");
		}else
			System.out.println("Not a Increasing number ");
	}

}
