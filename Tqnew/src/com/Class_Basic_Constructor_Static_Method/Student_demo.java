package com.Class_Basic_Constructor_Static_Method;

public class Student_demo {
	int S_id;
	String S_name;
	int S_marks;
	
	//Student_demo(){}
	Student_demo(int S_id,String S_name,int S_marks)
	{
		this.S_id=S_id;
		this.S_name=S_name;
		this.S_marks=S_marks;
		this.show();
	}
	
	void show()
	{
		System.out.println("Student ID : "+S_id);
		System.out.println("Student Name : "+S_name);
		System.out.println("Student Marks : "+S_marks);
	}
	public static void main(String[] args) {
	Student_demo Student = new Student_demo(21,"Sandesh",90);
	
	}

}
