package com.Class_Basic_Collection_Comparator_mix;

import java.util.ArrayList;
import java.util.Collections;

public class Employee_demo {
	int e_id;
	String e_name;
	double e_sal;
	MyDate d;
	
	Employee_demo(int id,String name,double sal,MyDate o)
	{
		e_id=id;
		e_name=name;
		e_sal = sal;
		d=o;
	}

	public String toString()
	{
		return e_id+" "+e_name+" "+e_sal+" "+d.day+" "+d.month+" "+d.year;
	}
	public static void main(String[] args) {
		ArrayList<Employee_demo> e=new ArrayList<>();
		
		e.add(new Employee_demo(111,"Sandesh",60000.20,new MyDate(12,02,2000)));
		e.add(new Employee_demo(113,"Sarvesh",50000.30,new MyDate(12,02,2020)));
		e.add(new Employee_demo(115,"Mangesh",30000.50,new MyDate(12,02,2001)));
		e.add(new Employee_demo(112,"Sidddesh",70000.10,new MyDate(12,02,2005)));
		e.add(new Employee_demo(114,"Swadesh",90000.90,new MyDate(12,05,2000)));
		e.add(new Employee_demo(117,"Sanjay",85000.90,new MyDate(10,05,2000)));
		
		System.out.println(e);
		
		Collections.sort(e,new Emp_comp());
		System.out.println(e);
		
		

	}

}
