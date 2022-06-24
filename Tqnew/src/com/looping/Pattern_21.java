package com.looping;

public class Pattern_21 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1||j==2||j==4||j==5)
				{
				System.out.print("* ");
				}
				else
					System.out.print("0 ");
			}
			System.out.println("  ");
		}
		

	}

}
