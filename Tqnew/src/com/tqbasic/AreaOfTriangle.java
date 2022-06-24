package com.tqbasic;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Base and Height of Triangle : ");
		double b=s.nextDouble();
		double h=s.nextDouble();
		
		double area=(0.5*b*h);
		
		System.out.println("Area of Triangle : "+area);
		

	}

}
