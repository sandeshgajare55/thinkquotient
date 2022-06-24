package com.Class_Basic_Constructor_Static_Method;

public class Static_Overloading {
	static int a, b, c, d, e;

	public static void Addition(int a, int b) {
		System.out.println("Addition of 2 Static Variables : " + (a + b));
	}

	public static void Addition(int a, int b, int c, int d) {
		e = a + b + c + d;
		System.out.println("Addition of 4 Static Variables :  " + e);
	}

	public static void main(String[] args) {
		Addition(10, 20);
		Addition(20, 10, 30, 40);

	}

}
