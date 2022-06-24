package com.Class_Basic_Constructor_Static_Method;

import java.util.Scanner;

public class Emp {
	static int e_id;
	String e_name;
	double e_sal;

	void EId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EID : ");
		e_id = sc.nextInt();
	}

	void Accept() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		e_name=sc.next();
		System.out.println("Enter Salary : ");
		e_sal=sc.nextDouble();
		System.out.println("--------------------------------------------");

	}

	void Show() {
		System.out.println("Employee ID : " + e_id);
		System.out.println("Employee Name : " + e_name);
		System.out.println("Employee Salary : " + e_sal);
		System.out.println("--------------------------------------------");
		
	}
	void Inc()
	{
		e_id=e_id+1;
		System.out.println("Employee Id :"+e_id);
	}

	public static void main(String[] args) {
		Emp E1 = new Emp();
		Emp E2 = new Emp();
		Emp E3 = new Emp();
		Emp E4 = new Emp();
		Emp E5 = new Emp();
E1.EId();
		E1.Accept();
		E1.Show();
		E1.Inc();
		E2.Accept();
		E2.Show();
		E2.Inc();
		E3.Accept();
		E3.Show();
		/*E3.Inc();
		E4.Accept();
		E4.Show();
		E4.Inc();
		E5.Accept();
		E5.Show();
		*/

	}

}
