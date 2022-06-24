package com.Class_Basic_Final_Abstract_Interface;

public class Child51 extends Showroom {

	public void showName() {
		System.out.println(" Showroom Name : Rohan Hyundai");
	}

	public void carName() {
		System.out.println(" Car Name : Hyundai Creta Top Model 2021");
	}

	public static void main(String ar[]) {
		Child51 child = new Child51();
		child.showName();
		child.carName();
	}
}
