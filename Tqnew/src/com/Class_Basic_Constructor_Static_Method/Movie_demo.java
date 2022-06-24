package com.Class_Basic_Constructor_Static_Method;

import com.Class_Basic.Variable_demo;

public class Movie_demo extends Variable_demo {
	int a, b;

	Movie_demo(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void print() {
		System.out.println("Addition : " + (a + b));
	}

	public static void main(String[] args) {
		Movie_demo M = new Movie_demo(10, 20);
		M.print();
		Variable_demo V = new Variable_demo();

	}

}
