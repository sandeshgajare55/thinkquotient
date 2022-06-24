package com.looping;
import java.util.Scanner;
public class Harshad_Number {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to check whether its Harshad Number or not : ");
		int num=sc.nextInt();
		int temp=0,tnum=0,sum=0,div=0;
		tnum=num;
				while(num>0)
				{
					temp=num%10;
					sum=sum+temp;
					num/=10;
				//	System.out.println(temp);
					
				}
				System.out.println("Sum "+sum);
					div=tnum%sum;
					System.out.println("Remainder : "+div);
					if(div==0)
					{
						System.out.println("Yes its Harshad Number..");
					}
					else
						System.out.println("Not a Harshad Number");
				

	}

}
