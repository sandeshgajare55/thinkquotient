package com.Class_Basic_2D_Array;

import java.util.Arrays;

public class Student_demo {
	
	int roll_no,marks[];
	String name;
	
	Student_demo(int roll_no,String name,int marks[])
	{
		this.roll_no=roll_no;
		this.name=name;
		this.marks=marks;
	}

	public void display()
	{
		System.out.println("Student rollno : "+roll_no);
		System.out.println("Student rollno : "+name);
		System.out.println("Marks in Different Subjects");
		/*for(int i=0;i<marks.length;i++)
		{
			System.out.print(" "+marks[i]);
		}*/
		System.out.println(Arrays.toString(marks));
	}
	
	public static void main(String ar[])
	{
		int a[]= {50,60,70,80,75};
		int b[]= {70,80,90,80,70};
		Student_demo student1 = new Student_demo(7,"Sandesh",a);
		Student_demo student2 = new Student_demo(10,"Sarvesh",b);
		student1.display();
		student2.display();
		
	}
}
