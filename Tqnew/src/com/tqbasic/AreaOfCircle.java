package com.tqbasic;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Raidius of a Cricle : ");
		double r=s.nextDouble();
		double p=2.14;
		double area=2*p*r;
		
		System.out.println("Area Of Circle : "+area);
	

	}

}
