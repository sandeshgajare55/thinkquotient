package com.Class_Basic_Inhertitance;

public class Gaming_laptop extends Laptop {

	String G_name;

	Gaming_laptop(String G_name) {
		super("HP");
		this.G_name = G_name;
	}

	void show() {
		System.out.println("Laptop Manufacturer : " + L_name);
		System.out.println("Gaming Model :  " + G_name);
	}

	public static void main(String[] args) {
		Gaming_laptop G = new Gaming_laptop("HP inspire 10");
		G.show();

	}

}
