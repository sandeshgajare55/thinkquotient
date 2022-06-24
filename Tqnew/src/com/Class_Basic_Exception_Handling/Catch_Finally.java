package com.Class_Basic_Exception_Handling;

public class Catch_Finally {
	public static void main(String args[]) {
		try {
			int a = 12;
			int b = 0;
			int c = a / b;
		} catch (ArithmeticException e1) {
			System.out.println("Divide by Zero error");
		} finally {
			System.out.println("Operation Performed");
		}
	}

}
