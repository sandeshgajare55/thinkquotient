package com.Class_Basic_Constructor_Static_Method;

public class Instance_block {
static
{
	System.out.println("ststic");
}
static
{
	System.out.println("ststic2");
}
	{
		System.out.println("Instance Block 1");
	}
	public Instance_block()
	{
		System.out.println("COnstructor"); 
	}
	public static void main(String[] args) 
	{
		Instance_block IB = new Instance_block();
	System.out.println("Main method");	
	Instance_block IB2 = new Instance_block();
	}

}
