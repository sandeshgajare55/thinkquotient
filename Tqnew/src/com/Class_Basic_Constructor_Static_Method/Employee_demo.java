package com.Class_Basic_Constructor_Static_Method;

public class Employee_demo {

	int E_id;
	String E_name;
	double E_sal;

	Employee_demo(int E_id, String E_name, double E_sal) {
		this.E_id = E_id;
		this.E_name = E_name;
		this.E_sal = E_sal;
	}

	void Display() {
		System.out.println("Employee ID : " + E_id);
		System.out.println("Employee Name : " + E_name);
		System.out.println("Employee Salary : " + E_sal);
	}

	public static void main(String[] args) {
		Employee_demo Employee = new Employee_demo(712, "Sandesh", 152300.51);
		Employee.Display();

	}

}
