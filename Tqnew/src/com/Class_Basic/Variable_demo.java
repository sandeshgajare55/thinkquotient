package com.Class_Basic;

public class Variable_demo {
	protected int roll_no = 23;
	String name = "Sunny";
	protected int division = 10;
	public String school = "Auxilium";

	protected int roll(int roll_no) {
		return roll_no + 2;
	}

	public static void main(String args[]) {
		Variable_demo V = new Variable_demo();
		System.out.println("Roll no : " + V.roll_no);
		// System.out.println("Name : "+V.name);
		// System.out.println("Division : "+V.division);
		// System.out.println("School : "+V.school);

	}

}
