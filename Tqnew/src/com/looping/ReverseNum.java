package com.looping;

import java.util.*;
public class ReverseNum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to Reverse : ");
		int num=sc.nextInt();
		int rm=0,reverse=0;

			/*while(num!=0)
			{
				rm=num%10;
				reverse = reverse * 10+rm;
				num/=10;
					
			}*/
					for(int i=1;num!=0;i++)
					{
						rm=num%10;
						reverse = reverse * 10 +rm;
						num/=10;
					}
			
			System.out.println(reverse);
	}

}
