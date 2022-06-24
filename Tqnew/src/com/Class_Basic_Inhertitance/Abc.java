package com.Class_Basic_Inhertitance;

public class Abc extends Overidding_demo {

	public int Addition(int p, int q) {
		return p + q;
	}

	public int Subtraction(int r, int s) {
		return r + s;
	}

	public static void main(String ar[]) {
		Abc abc = new Abc();
		System.out.println("Addition : " + abc.Addition(50, 50));
		System.out.println("Subtraction : " + abc.Subtraction(100, 50));
	}
}
