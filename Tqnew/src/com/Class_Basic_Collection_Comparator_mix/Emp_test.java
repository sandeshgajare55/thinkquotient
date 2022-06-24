package com.Class_Basic_Collection_Comparator_mix;

import java.util.ArrayList;
import java.util.Collections;

public class Emp_test{

	int id;
	String name,dept;
	double salary;
	Another_demo demo;
	
	Emp_test(int i,String n,double s,String d,Another_demo f)
	{
		id=i;
		name=n;
		salary=s;
		dept=d;
		demo=f;
	}
	
	public String toString()
	{
		return id+" "+name+" "+salary+" "+dept+" "+demo.state+" "+demo.country;
	}
}