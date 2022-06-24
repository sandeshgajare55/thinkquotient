package com.looping;

import java.util.Scanner;
public class User_input {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input : ");
		int p_num=sc.nextInt();
		int cnt=0;
		
		for(int i=1;i>0;i++)
		{
			if(p_num>0)
			{
				cnt++;
				System.out.println("Positive Number,Enter the Input again :");
				p_num=sc.nextInt();
			}
			else if(p_num<0)
			{
				System.out.println("Negative Number "+p_num);
				break;
			}
			
		}
		System.out.println("User Entered the Positive Input "+cnt+" times");
		
		

	}

}
