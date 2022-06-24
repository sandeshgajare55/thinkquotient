package com.Class_Basic_Final_Abstract_Interface;

public class Student {

	int rollno;
	String name;

	Student() {
	}

	Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}

	void show() {
		System.out.println("Hello");
	}

	public static void main(String ar[]) {
		final double P = 3.14;
		Student S = new Student(101, "Sandesh");
		// System.out.println(S.hashCode());
		System.out.println(S);
		System.out.println(P);
	}
}

class College extends Student {
	public void show() {
		System.out.println("Hello Students ");
	}

	public static void main(String ar[]) {
		College C = new College();
		C.show();
	}

}
