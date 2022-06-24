package com.looping;

import java.util.Scanner;
import java.util.Scanner.*;

public class KaprekarNum {

	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number to check whether its Kaprekar or not : ");
			int num=sc.nextInt();
			int square=0;
			int pow,tempnum,t,cnt=0,finals=0,y;
			y=num;
			tempnum=num;
			
						square=num*num;
						System.out.println("Square of a Number is : "+square);
						  for(int j=0;j<=num;j++)
						  {
							  t=num%10;
							  num=num/10;
							  cnt++;
							  num--;
							 
						}
						  System.out.println(cnt);
						  
						  int power=(int) Math.pow(10, cnt);
						   System.out.println(power);
						   
						   tempnum=square%power;
						   System.out.println(tempnum);
						   square/=power;
						   System.out.println(square);
						   
						   finals=square+tempnum;
						   System.out.println(finals);
						   
						   if(finals==y)
						   {
							   System.out.println("Number is Kaprekar...");
						   }
						   else
							   System.out.println("Not a Kaprekar Number...");
	}

}
