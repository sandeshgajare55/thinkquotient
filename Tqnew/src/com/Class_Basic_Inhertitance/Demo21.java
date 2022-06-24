package com.Class_Basic_Inhertitance;

public class Demo21 extends Super_demo{

	Demo21(){
		super(20);//calling superclass constructor
		System.out.println("Parent Class value of a : "+super.a);//accessing super class variable
	}
	
	public void show()
	{
		super.Display();//calling super class method
		System.out.println("Sub-Class Method...");
	}
	public static void main(String ar[])
	{
		Demo21 Demo = new Demo21();
		Demo.show();
	
	}
}
