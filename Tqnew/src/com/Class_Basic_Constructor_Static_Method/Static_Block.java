package com.Class_Basic_Constructor_Static_Method;

public class Static_Block {
static int a=50;
static int c=10,d=20;
	static {
		System.out.println("------------Static Block1-----------");
		System.out.println("Square of a Number "+a+" is : "+a*a);
	}
	
	public static void main(String[] args) 
	{
	int b=3;
	System.out.println("------------Main Method-----------");
	System.out.println("Cube of a Number "+b+" is : "+(b*b*b));

	}
	static {
		System.out.println("------------Static Block2-----------");
		System.out.println("Addition of a Number "+c+d);
	}

}
