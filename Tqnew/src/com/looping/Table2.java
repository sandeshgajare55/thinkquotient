package com.looping;

public class Table2 {

	public static void main(String[] args) 
	{
		int num=1;
			
		while(num<=5)
		{
				for(int i=1;i<=10;i++)
				{
					System.out.println(num+"X"+i+"="+(num*i));
				
				}
				System.out.println("--------------------------");
			num++;	
		}	
	}

}

