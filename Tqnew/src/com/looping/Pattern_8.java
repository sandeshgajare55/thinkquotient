package com.looping;

import java.util.Scanner;
public class Pattern_8 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		int temp=0;
		int cnt=0;
		int dnum=num;
		      for(int i=0;i<=9;i++)
		      {
		    	  cnt=0;
		    	  while(num>0)
		    	  {
		    	  temp=num%10;
		    	  if(temp==i)
    			  {
    				  cnt++; 
    			  }
		    	  num=num/10;	  	    	  
		    	  }
		    	  if(cnt>0)
		    	  {
		    		  System.out.println(i+" is present "+cnt+" times");
		    		 // System.out.println("temp value "+temp); 
		    	  }	  
		    			
		    	num=dnum;
		    			  
		    			  }
		      }  		    	 
		      }	
	

