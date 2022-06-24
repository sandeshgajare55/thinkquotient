package com.tqbasic;

import java.util.Scanner;

public class Greater {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number to find which one is greater : ");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		int greater=(a>b)?(a>c?a:c):(b>c?b:c);
		
		System.out.println("Greater among 3 is : "+greater);
				
	}

}
