package com.looping;

public class Pattern_17 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1||i+j==4||i+j==3||i==4||i+j==6)
				{
					System.out.print("* ");
				}
				else
					System.out.print("   ");
			}
			System.out.println();
	}

}
}