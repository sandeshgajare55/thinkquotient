package com.Class_Basic_2D_Array;

public class Student {

	int id;
	String name;
	Course course;

	Student(int id, String name, Course course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ",Course ID=" + course.cid + ", Course Name=" + course.cname
				+ "]";
	}

	public static void main(String args[]) {
		Student student[] = new Student[5];
		student[0] = new Student(1, "Sandesh", new Course(701, "Java"));
		student[1] = new Student(2, "Sarvesh", new Course(702, "C++"));
		student[2] = new Student(3, "Sanket", new Course(703, "C languauge"));
		student[3] = new Student(4, "Shubham", new Course(704, "Angular"));
		student[4] = new Student(5, "Shiva", new Course(705, "Ruby"));

		for (int i = 0; i < student.length; i++) {
			if(student[i].course.cname.equals("Java"))
			System.out.println(student[i]);
		}

	}
}