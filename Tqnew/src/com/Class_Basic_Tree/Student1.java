package com.Class_Basic_Tree;
import java.util.Comparator;

public class Student1 implements Comparable<Student1>{
	
		int s_id;
		String s_name;
		Float marks;

		public Student1()
		{
			
		}
		public Student1(int s_id, String s_name, float marks) {
			super();
			this.s_id = s_id;
			this.s_name = s_name;
			this.marks = marks;
		}
		@Override
		public String toString() {
			return s_id + " "+  s_name + " "+  marks ;
		}
	
		
		@Override
		public int compareTo(Student1 o) {
			return this.s_name.compareTo(o.s_name);
		}


}
