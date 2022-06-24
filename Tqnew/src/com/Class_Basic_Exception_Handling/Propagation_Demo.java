package com.Class_Basic_Exception_Handling;

public class Propagation_Demo {
	int divide() {
		int a = 10;
		int b = 0;
		int c = a / b;
		return c;
	}

	int square() {
		Propagation_Demo d = new Propagation_Demo();
		int a = 5;
		int s = a * a;
		d.divide();
		return s;

	}

	public static void main(String args[]) {
		try {
			Propagation_Demo demo = new Propagation_Demo();
			demo.square();
		} catch (ArithmeticException e1) {
			System.out.println("EXCEPTION : Divide by zero");
		}
	}

}
