package com.Class_Basic_Final_Abstract_Interface;

public class Person_99 implements Employee, Sportperson {

	public String eName() {
		return "Sarvesh Pathak";
	}

	public String sportName() {
		return "Cricket";
	}

	public static void main(String ar[]) {
		Person_99 child = new Person_99();
		System.out.println(" Employee Name : " + child.eName());
		System.out.println(" SportPerson : " + child.eName() + " he plays " + child.sportName());

	}
}
