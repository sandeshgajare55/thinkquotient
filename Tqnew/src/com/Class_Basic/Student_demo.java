package com.Class_Basic;

public class Student_demo {
	int S_id, S_marks;
	String S_name;

	public static void main(String[] args) {

		Student_demo s = new Student_demo();
		s.S_id = 007;
		s.S_name = "Sunny";
		s.S_marks = 85;
		System.out.println("Student ID : " + s.S_id);
		System.out.println("Student Name : " + s.S_name);
		System.out.println("Student Marks : " + s.S_marks);
	}

}
