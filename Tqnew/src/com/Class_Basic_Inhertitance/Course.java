package com.Class_Basic_Inhertitance;

public class Course {

	int cid;
	String name;
	double fees;
	Student S;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public Student getS() {
		return S;
	}

	public void setS(Student s) {
		S = s;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", name=" + name + ", fees=" + fees + ", Student ID =" + S.sid
				+ ", Student Name =" + S.sname + "]";
	}

	/*
	 * Course(int cid,String name,double fees,Student S) { this.cid=cid;
	 * this.name=name; this.fees=fees; this.S=S; }
	 */
	public static void main(String ar[]) {
		Course course = new Course();
		course.setCid(155);
		course.setName("ENP");
		course.setFees(50000);
		course.setS(new Student());
		course.getS().setSid(77);
		course.getS().setSname("Sunny");

		System.out.println(course);
	}
}
