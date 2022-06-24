package com.Class_Basic_Final_Abstract_Interface;

public class Child_variable extends Variable_X implements Variable_Y {

	public int Addition()
	{
		return a+b;
	}
	public static void main(String ar[])
	{
		Child_variable child = new Child_variable();
		System.out.println("Addition : "+child.Addition());
	}
}
