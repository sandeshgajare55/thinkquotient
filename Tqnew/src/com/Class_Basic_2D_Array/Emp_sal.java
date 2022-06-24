package com.Class_Basic_2D_Array;

public class Emp_sal {
	int e_id;
	String e_name;
	double e_sal;

	Emp_sal(int e_id, String e_name, double e_sal) {
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_sal = e_sal;
	}

	public static void main(String args[]) {
		Emp_sal emp[] = new Emp_sal[3];
		emp[0] = new Emp_sal(101, "Sunny", 50000);
		emp[1] = new Emp_sal(102, "Sarvesh", 48000);
		emp[2] = new Emp_sal(103, "Sanket", 14000);
		System.out.println("Details of Employees : ");
		for (int i = 0; i < emp.length; i++) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("Employee ID : " + emp[i].e_id);
			System.out.println("Employee Name  : " + emp[i].e_name);
			System.out.println("Employee Salary : " + emp[i].e_sal+" RS");
		}
		System.out.println("--------------------------------------------------------------");
		System.out.println("Salary Updated of employee with salary less than  15k : ");
		System.out.println("--------------------------------------------------------------");
		for (int i = 0; i < emp.length; i++) {
			if (emp[i].e_sal < 15000) {

				emp[i].e_sal = emp[i].e_sal + (emp[i].e_sal * 0.1);
			}
			System.out.println("--------------------------------------------------------------");
				System.out.println("Employee ID : " + emp[i].e_id);
				System.out.println("Employee Name : " + emp[i].e_name);
				System.out.println("Employee Salary : " + emp[i].e_sal+" RS");
			}
		}

	}

