package com.Class_Basic_Inhertitance;

public class Student_demo {
	int rollno;
	String name;
	Dept d;

	Student_demo() {
	}

	public Dept getD() {
		return d;
	}

	public void setD(Dept d) {
		this.d = d;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Student_demo [rollno=" + rollno + ", name=" + name + ", Dept_name=" + d.name + ", Dept_id=" + d.id
				+ "]";
	}

	public static void main(String ar[]) {
		Student_demo S = new Student_demo();
		S.setRollno(21);
		S.setName("Sunny");
		S.setD(new Dept());
		S.getD().setId(101);
		S.getD().setName("Store");

		/*
		 * System.out.println("Student Roll_no : " + S.getRollno());
		 * System.out.println("Student Name : " + S.getName());
		 * System.out.println("Department ID : " + S.getD().getId());
		 * System.out.println("Department Name : " + S.getD().getName());
		 */
		System.out.println(S);

	}
}
