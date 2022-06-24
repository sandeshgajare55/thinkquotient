package com.looping;

public class Pattern_11 {

	public static void main(String[] args) 
	{		
		for(int i=64;i<=68;i++)
		{
			for(int j=64;j<i;j++)
			{
				char b = (char) (j+1);
				//int c = (int)b;
				//System.out.println("value"+c);
				System.out.print(b);
			}
			System.out.println();
		}
		

	}

}
