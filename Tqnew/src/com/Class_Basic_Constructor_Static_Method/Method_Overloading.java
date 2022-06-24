package com.Class_Basic_Constructor_Static_Method;

public class Method_Overloading {

	public int Calculate(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public float Calculate(float a, float b) {
		return a - b;
	}

	public double Calculate(double a, double b, double c) {
		return a*b*c;
	}

	public long Calculate(long a, long b) {
		return a / b;
	}
	

	public static void main(String[] args) {
		Method_Overloading Method = new Method_Overloading();
		System.out.println("Addition : " + Method.Calculate(10, 20, 30, 40));
		System.out.println("Subtraction : " + Method.Calculate(20.1f, 10.9f));
		System.out.println("Multiplication : " + Method.Calculate(10, 20, 30));
		System.out.println("Division : " + Method.Calculate(20, 10));
	}

}
