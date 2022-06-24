package com.Class_Basic_2D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Student_marks {
	int s_id;
	String s_name;
	int Marks[];

	Student_marks() {
	}

	Student_marks(int s_id, String s_name, int Marks[]) {
		this.s_id = s_id;
		this.s_name = s_name;
		this.Marks = Marks;
	}

	public double perCalc(int Marks[]) {
		int sum = 0;
		double per = 0;
		for (int i = 0; i < Marks.length; i++) {
			sum = sum + Marks[i];
		}
		per = (sum * 100) / (Marks.length * 100);

		return per;
	}

	public String toString() {
		return "Student_marks [s_id=" + s_id + ", s_name=" + s_name + ", Marks=" + Arrays.toString(Marks) + "]";
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Student_marks student[] = new Student_marks[2];

		int s_id;
		String s_name;

		for (int i = 0; i < student.length; i++) {
			student[i] = new Student_marks();
		}

		for (int i = 0; i < student.length; i++) {
			System.out.println("Enter the ID,Name,Marks for " + (i + 1) + " Student : ");
			s_id = sc.nextInt();
			s_name = sc.next();
			int Marks[] = new int[3];
			for (int j = 0; j < Marks.length; j++) {
				Marks[j] = sc.nextInt();
			}
			System.out.println("---------------------------------------------");
			// System.out.println(student[i].perCalc(Marks));
			student[i] = new Student_marks(s_id, s_name, Marks);
		}
		for (int j = 0; j < student.length; j++) {

			if (student[j].perCalc(student[j].Marks) > 60) {
				System.out.println((student[j]));
			}
		}

	}

}
