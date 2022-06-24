package com.Class_Basic_Final_Abstract_Interface;

public class Shape extends Shape_Abs {
	String h;

	public void Shape(String h) {
		S_name = h;
	}

	public static void main(String ar[]) {
		Shape_Abs A = new Shape();
		A.Shape("Circle");
		System.out.println(A.getS_name());

	}
}
