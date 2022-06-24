package com.Class_Basic_2D_Array;

import java.util.Arrays;

public class Emp_demo {
	int e_id;
	String e_name;
	double e_sal;

	Emp_demo() {
	}

	Emp_demo(int e_id, String e_name, double e_sal) {
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_sal = e_sal;
	}

	public void Display() {
		System.out.println("-----------------------------------");
		System.out.println("Employee ID : " + e_id);
		System.out.println("Employee ID : " + e_name);
		System.out.println("Employee ID : " + e_sal);
	}

	public String toString() {
		return "Emp_demo e_id=" + e_id + ", e_name=" + e_name + ", e_sal=" + e_sal + "\n";
	}

	public static void main(String args[]) {

		Emp_demo emp[] = new Emp_demo[5];

		emp[0] = new Emp_demo(101, "Sunny", 98000.23);
		emp[1] = new Emp_demo(102, "Sarvesh", 94590.23);
		emp[2] = new Emp_demo(103, "Sanket", 987486.23);
		emp[3] = new Emp_demo(104, "Shiva", 974580.23);
		emp[4] = new Emp_demo(105, "Shubham", 98520.23);

		for (int i = 0; i < emp.length; i++) {
			emp[i].Display();
		}

		// System.out.println(Arrays.toString(emp));

		/*
		 * for(Emp_demo e:emp) { System.out.println(e); }
		 */

		/*
		 * for(int i=0;i<emp.length;i++) { System.out.println(emp[i]); }
		 */
	}
}
