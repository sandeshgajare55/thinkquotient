package com.Class_Basic_Constructor_Static_Method;

public class Method_2 {
	float p = 2.14f;

	public double Area(double r) {
		return p * (r * r);
	}

	public int Area(int l, int b) {
		return l * b;
	}

	public int Area(int s) {
		return s * s;
	}

	public float Area(float b, float h) {
		return (float) (0.5 * (b * h));
	}

	public static void main(String[] args) {
		Method_2 Method = new Method_2();
		System.out.println("Area of Circle : " + Method.Area(2.3));
		System.out.println("Area of Rectangle : " + Method.Area(20,30));
		System.out.println("Area of Triangle : " + Method.Area(10.5f,30.2f));
		System.out.println("Area of Square : " + Method.Area(5));
	}

}
