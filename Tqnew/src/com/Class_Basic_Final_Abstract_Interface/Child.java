package com.Class_Basic_Final_Abstract_Interface;

public class Child extends Scenario2 {

	public int Addition() {
		return 10 + 20;
	}

	public int Subtraction() {
		return 100 - 50;
	}

	public void Show2() {
		super.Show2();
		System.out.println("Child ");

	}

	public static void main(String ar[]) {
		Child child = new Child();
		System.out.println("Addition :  " + child.Addition());
		System.out.println("Subtraction : " + child.Subtraction());
		child.Show2();
	}
}
