package com.looping;

public class Pattern_24
{ 
	public static void main(String arg[])
	{
		char a='A';
		
		for(int i=1; i<=5; i++)   
		{   
			char b=a;
			for(int j=1; j<=i; j++)   
			{   
				if(i%2!=0)
				{
				System.out.print(""+j);   
				}
				else
					System.out.print((char)b++);   
				}   
			System.out.println();   
		
		}
	}

}
