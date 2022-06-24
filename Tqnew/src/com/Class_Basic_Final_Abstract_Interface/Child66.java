package com.Class_Basic_Final_Abstract_Interface;

public class Child66 implements College_demo {

	public int collegePin(int pin) {
		return pin;
	}

	public static void main(String ar[]) {
		int pin = 414003;
		Child66 child = new Child66();
		child.collegeName();
		College_demo.collegeOwner();
		System.out.println("College Pin : " + child.collegePin(pin));

	}
}
