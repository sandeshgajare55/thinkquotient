package com.Class_Basic_2D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Emp {
	int e_id;
	String e_name;
	double e_sal;

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public double getE_sal() {
		return e_sal;
	}

	public void setE_sal(double e_sal) {
		this.e_sal = e_sal;
	}

	public String toString() {
		return "Emp [e_id=" + e_id + ", e_name=" + e_name + ", e_sal=" + e_sal + "]";
	}

	public static void main(String args[]) {
		Emp emp[] = new Emp[5];
		Scanner sc = new Scanner(System.in);
		int id;
		String name;
		double sal;
//		for (int i = 0; i < 2; i++) {
//			
//		}
//
//		
		for(int i=0;i<2;i++)
		{
			emp[i] = new Emp();
			System.out.println("Enter data for "+(i+1)+" record : ");
			System.out.println(" Enter ID : ");
			id=sc.nextInt();
			System.out.println(" Enter Name : ");
			name=sc.next();
			System.out.println("Enter Salary : ");
			sal=sc.nextDouble();
			emp[i].setE_id(id);
			emp[i].setE_name(name);
			emp[i].setE_sal(sal);
		}
		
		for(int i=0;i<2;i++)
		{
			System.out.println(" -------------------------------------- ");
			System.out.println(" Employee ID : "+emp[i].getE_id());
			System.out.println(" Employee Name : "+emp[i].getE_name());
			System.out.println(" Employee Salary : "+emp[i].getE_sal());
		
		}
		
		/*emp[0].setE_id(105);
		emp[0].setE_name("Sunny");
		emp[0].setE_sal(10055.2);
		emp[1].setE_id(104);
		emp[1].setE_name("Sarvesh");
		emp[1].setE_sal(10055.2);
		emp[2].setE_id(103);
		emp[2].setE_name("Shubham");
		emp[2].setE_sal(10055.2);
		emp[3].setE_id(102);
		emp[3].setE_name("Shiva");
		emp[3].setE_sal(10055.2);
		emp[4].setE_id(101);
		emp[4].setE_name("Sanket");
		emp[4].setE_sal(10055.2);
*/
		//System.out.println(Arrays.toString(emp));
	}
}
