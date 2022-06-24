package com.Class_Basic;

import java.util.Scanner;

public class Student_demo_2 {
	int s_id;
	String s_name;
	int m1, m2, m3;
	int per = 0, t = 0;
	String a = " ";

	public void AcceptDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID : ");
		s_id = sc.nextInt();
		System.out.println("Enter Student Name : ");
		s_name = sc.next();
		System.out.println("Enter Marks of M1 : ");
		m1 = sc.nextInt();
		System.out.println("Enter Marks of M2 : ");
		m2 = sc.nextInt();
		System.out.println("Enter Marks of M3 : ");
		m3 = sc.nextInt();

	}

	public void Calculate() {
		t = m1 + m2 + m3;
		per = (t * 100) / 300;

		if (per > 70) {
			a = "First Class with Distinction";
		} else if (per > 60 && per < 70) {
			a = "First Class";
		} else if (per > 50 && per < 60) {
			a = "Second Class";
		} else if (per > 35 && per < 50) {
			a = "Third Class";
		} else if (per < 35) {
			a = "Fail";
		}

	}

	public void Display() {
		System.out.println(" Student Id  : " + s_id);
		System.out.println(" Student Name  : " + s_name);
		System.out.println(" Marks Total  : " + t);
		System.out.println("Percentage : " + per + " %");
		System.out.println("Grade : " + a);
	}

	public static void main(String[] args) {
		Student_demo_2 s1 = new Student_demo_2();
		// Student_demo_2 s2= new Student_demo_2();
		s1.AcceptDetails();
		s1.Calculate();
		s1.Display();

	}

}
