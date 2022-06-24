package com.Class_Basic_Constructor_Static_Method;

public class Emp_123 {
	int e_id;
	String e_name;
	double e_sal;
   static int cnt;
	Emp_123(int e_id, String e_name, double e_sal) {
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_sal = e_sal;
		Emp_123.Total_emp();
	}
public static int Total_emp() {
		cnt++;
		return cnt;
	}
	void Display() {
		System.out.println("--------------------------------------------");
		System.out.println("Employee ID : " + e_id);
		System.out.println("Employee Name : " + e_name);
		System.out.println("Employee Salary : " + e_sal);
		System.out.println("--------------------------------------------");
		System.out.println("There are total "+cnt+" no of Employees");
	}

	
	
	public static void main(String args[]) {
		Emp_123 E1 = new Emp_123(101, "Sandesh", 10000.30);
		Emp_123 E2 = new Emp_123(102, "Sarvesh", 50000.20);
		Emp_123 E3 = new Emp_123(103, "Sanket", 60000.15);
		Emp_123 E4 = new Emp_123(104, "Shubham", 70000.25);
		Emp_123 E5 = new Emp_123(105, "Pravin", 100000.50);

		E1.Display();
		E2.Display();
		E3.Display();
		E4.Display();
		E5.Display();
	}
}
