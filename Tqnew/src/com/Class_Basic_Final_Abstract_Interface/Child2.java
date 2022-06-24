package com.Class_Basic_Final_Abstract_Interface;

public class Child2 extends Department {

	public String Cname() {
		return "Accenture";
	}

	public String Dname() {
		return "Desgin Department";
	}

	public void Ddetails() {
		super.Ddetails();
		System.out.println("---------------Details-----------");
	}

	public static void main(String ar[]) {
		Child2 child = new Child2();
		child.Ddetails();
		System.out.println("Company Name : " + child.Cname());
		System.out.println("Department Name : " + child.Dname());

	}

}
