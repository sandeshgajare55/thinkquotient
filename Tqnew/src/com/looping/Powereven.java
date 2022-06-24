//3 power of even no 
package com.looping;

import java.util.*;
import java.math.*;
public class Powereven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Even Number and also power of it ");
		int n=sc.nextInt();
		int p=sc.nextInt();
		int pow=1;
		int i=1;
			
		/*   for(int i=1;i<=p;i++)
		   {
					pow=pow*n;
				
		   }
		   System.out.println("Multiplication with power :"+pow);
	}*/
		
		while(i<=p) 
		{
			pow=pow*n;
			i++;
		}
		System.out.println("Multiplication with power :"+pow);
		}

}
