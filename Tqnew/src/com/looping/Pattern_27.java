package com.looping;

public class Pattern_27 {

	public static void main(String[] args) {
		int j;
		for(int i=5;i>=1;i--)
		{
		for( j=5;j>i;j--)
		{
			System.out.print(" ");
		}
			for( int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
	}


