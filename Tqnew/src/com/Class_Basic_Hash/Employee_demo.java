package com.Class_Basic_Hash;

public class Employee_demo implements Comparable<Employee_demo> {

	int id;
	String name,dept,contact;
	
	Employee_demo(int i,String n,String d,String c)
	{
		id=i;
		name=n;
		dept=d;
		contact=c;
	}
	
	public String toString()
	{
		return id+" "+name+" "+dept+" "+contact;
	}

@Override
public int compareTo(Employee_demo o) {
		return 1;
}
	
	
//	public int hashCode()
//	{
//		return id;
//	}
//	
//	
//	public boolean equals(Object O)
//	{
//		Employee_demo E = (Employee_demo) O;
//		
//		if(this.id==E.id)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
//	}
}
