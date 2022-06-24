//Odd Numbers between 1 to 20
package com.looping;

public class OddAddition {

	public static void main(String[] args) 
	{
		int i;
		int sum=0;
		
		System.out.println("Odd Numbers between 1 to 20");
	
		 for( i=1; i<=20; i++)
		  {
		    if(i%2!=0) 
		    {
		    	System.out.println(i);
		    	sum += i;
		    }
		  }
		System.out.println("Sum of the Odd numbers from 1 to 20 : "+sum);
		
	}

}
