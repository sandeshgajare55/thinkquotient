package com.Class_Basic;

import java.util.Scanner;

public class Emp_demo {
	int e_id;
	String e_name;
	double e_sal;

	public void Acceptdetail(int a, String s, double d) {
		e_id = a;
		e_name = s;
		e_sal = d;

	}

	public void Display() {
		System.out.println("Employee ID : " + e_id);
		System.out.println("Employee Name : " + e_name);
		System.out.println("Employee Salary : " + e_sal);
		System.out.println();
	}

	public static void main(String ar[]) {
		// Scanner sc = new Scanner(System.in);
		Emp_demo e1 = new Emp_demo();
		Emp_demo e2 = new Emp_demo();
		e1.Acceptdetail(007, "John Carter", 12000.30);
		e2.Acceptdetail(100, "Luke Wright", 11000.20);
		e1.Display();
		e2.Display();
	}

}
