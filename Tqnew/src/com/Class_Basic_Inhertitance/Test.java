package com.Class_Basic_Inhertitance;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Emp_demo E = new Emp_demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter emp id");
		int eid = sc.nextInt();

		Containment_demo C = new Containment_demo();
		System.out.println("Enter all containment class");
		int sno = sc.nextInt();
		int pin = sc.nextInt();
		String soc = sc.next();
		String city = sc.next();

		C.getAdd(sno, pin, soc, city);
		E.getid(eid, C);
		E.show();
	}

}
