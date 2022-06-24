package com.Class_Basic_Final_Abstract_Interface;

public class Child77 implements Micro_Employee {

	public String cName() {
		return "Micro-Focus";
	}

	public int eID() {
		return 17;
	}

	public String eName() {
		return "Sanket";
	}

	public String jRole() {
		return "Developer";
	}

	public static void main(String ar[]) {
		Child77 child = new Child77();
		System.out.println("Company Name : " + child.cName());
		System.out.println("Employee ID : " + child.eID());
		System.out.println("Employee Number : " + child.eName());
		System.out.println("Employee Role : " + child.jRole());
	}
}
