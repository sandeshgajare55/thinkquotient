package com.Class_Basic_Inhertitance;

public class Simple extends Laptop {

	String name;

	Simple(String name) {
		super("Dell");
		this.name = name;
	}

	void show() {
		System.out.println("Laptop Manufacturer: " + L_name);
		System.out.println("Model : " + name);
	}

	public static void main(String[] args) {
		Simple S = new Simple("Dell Vostro 5");
		S.show();
	}

}
