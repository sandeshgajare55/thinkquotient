package com.looping;
import java.util.Scanner;

public class Trimorphic_number {
		public static void main(String[] args) 
		{
			int num,cube,lsd=0,temp=0,t2,cnt=0,Onum=0;
			int pow=1,base=10;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number to check whether its Automorphic or not");
		    num=sc.nextInt();
		    Onum=num;
		    cube=num*num*num;
		    System.out.println("Cube of Number : "+cube);
			
		    for(int j=0;j<=num;j++)
		    {
		    	t2=num%10;	
	    		num=num/10;
	    		cnt++;
	    		num--;
	    		
		    }
		    System.out.println("Number Digits : "+cnt);
		    
		    
		   // int power=(int) Math.pow(10, cnt);
		   // System.out.println(power);
		    
		    while(cnt!=0)
		    {
		    	pow=pow*base;
		    	--cnt;
		    }
		   // System.out.println("powerwhile"+pow);
		    
		   
		    		temp=cube%pow;	 
		    		System.out.println("Temp"+temp);
		    		if(temp==Onum)
			    	{
			    		System.out.println("Trimorphic");
			    		
			    	}
			    	else if(temp!=Onum)
			    	{
			    		System.out.println("Not a Trimorphic");
			    		
			    	}
		    		
		    		
		    	
		    	
		    	
		}

	}



