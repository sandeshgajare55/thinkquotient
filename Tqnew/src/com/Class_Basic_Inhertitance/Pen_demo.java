package com.Class_Basic_Inhertitance;

public class Pen_demo {
	String P_brand;

	Pen_demo(String P_brand) {
		this.P_brand = P_brand;
	}

	void show() {
		System.out.println("Brand of Pen : " + P_brand);
	}

	public static void main(String ar[]) {

	}
}

class Pen_type extends Pen_demo {

	Pen_type() {
		super("Parker");
	}

	void show() {
		super.show();
		System.out.println("Ballpoint Pen");
		// System.out.println("Gelpoint Pen");
	}

	public static void main(String ar[]) {
		Pen_type Pen = new Pen_type();
		Pen.show();
	}
}