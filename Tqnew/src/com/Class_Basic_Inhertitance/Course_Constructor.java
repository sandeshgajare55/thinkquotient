package com.Class_Basic_Inhertitance;

public class Course_Constructor {
	int cid;
	String name;
	double fees;
	Student d;

	Course_Constructor(int cid, String name, double fees, Student d) {
		this.cid = cid;
		this.name = name;
		this.fees = fees;
		this.d = d;
	}

	public static void main(String ar[]) {
		Course_Constructor course = new Course_Constructor(144, "Java", 40000, new Student(54, "Sandesh"));

		System.out.println(course);

	}

	@Override
	public String toString() {
		return "Course_Constructor [Course ID=" + cid + ", Course name=" + name + ", Course fees=" + fees
				+ ", Student ID=" + d.sid + ", Student name=" + d.sname + "]";
	}
}
