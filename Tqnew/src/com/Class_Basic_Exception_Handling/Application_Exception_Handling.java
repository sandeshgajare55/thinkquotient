package com.Class_Basic_Exception_Handling;

public class Application_Exception_Handling {
	public static void main(String args[]) {
		try {
			int a=10;
			int b=0;
			int c=a/b;
		} 
		catch(ArithmeticException e)
		{
			System.out.println("Exception : Divide by Zero");
		}
			}
}
