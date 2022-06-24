package com.looping;

public class Pattern_20 {

	public static void main(String[] args) {
		for(int i=1; i<5; i++)   
		{   
			for(int j=1; j<=i; j++)   
			{   
				if(j==1||j==3)
				{
				System.out.print("1 ");   
				}
				else if(j==2||j==3||j==4)
				{
					System.out.print("0 ");   	
				}
				else
					System.out.print("1");   
				}   
			System.out.println();   
		
		}

	}

}
/*if(j==1||j==3)
{
System.out.print("1 ");   
}
else if(i%2==0)
{
	System.out.print("0  ");   	
}*/
