package com.Class_Basic_Hash;
import java.util.*;
public class Student_Tree implements Comparator<Student_demo_comp>{
	@Override
	public int compare(Student_demo_comp o1, Student_demo_comp o2) {
		 return 1;
	}
	public static void main(String ar[])
	{
		TreeMap<Integer,Student_demo> tm = new TreeMap<>();
		
		tm.put(1, new Student_demo(10,"Sandesh","Engg",90));
		tm.put(2, new Student_demo(11,"Sarvesh","Engg",70));
		tm.put(9, new Student_demo(12,"Sainesh","Engg",80));
		tm.put(3, new Student_demo(13,"Sanket","Engg",100));


		System.out.println(tm);
	
	}
	
	
	}

