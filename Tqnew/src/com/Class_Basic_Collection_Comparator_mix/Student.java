package com.Class_Basic_Collection_Comparator_mix;

import java.util.ArrayList;
import java.util.Collections;

public class Student {

	int id;
	String name,dept;
    ArrayList <Integer> list_1;
	
	Student(int i ,String n,String d,ArrayList<Integer> li)
	{
		id=i;
		name=n;
		dept=d;
		list_1=li;
		
	}
	
	public String toString()
	{
		return id+" "+name+" "+dept;
	}
	
}
