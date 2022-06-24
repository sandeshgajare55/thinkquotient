package com.looping;

public class Prime_Number_1_20 {

	public static void main(String[] args)
	{
		int ct=0,n=0,i=1,j=1;  
		System.out.println("Prime Number Between 1-20 ");
		while(n<20)  
		{  
		j=1;  
		ct=0; 
		if(i<20)
		{
		while(j<=i)  
		{  
			if(i%j==0)  
				ct++;  
				j++;   
		}  
			
			if(ct==2)  
			{  
				System.out.println(i);  
				n++;  
			}  
		i++;
		}
}
}
}