package com.Class_Basic_Hash;

public class Student_demo {
	
	int id,marks;
	String name,department;
	
	Student_demo(int i,String n,String d,int m)
	{
		id=i;
		name=n;
		department=d;
		marks=m;
	}
	
	
	public String toString()
	{
		return id+" "+name+" "+department+" "+marks;
	}

}
