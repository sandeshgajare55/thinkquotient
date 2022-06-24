package com.Class_Basic_Hash;
import java.util.*;
public class Department_demo implements Comparable<Department_demo> {
	
	int id,count;
	String name;
	
	Department_demo(int i,String n,int c)
	{
		id=i;
		name=n;
		count=c;
	}
	

	public String toString() {
		
		return id+" "+name+" "+count;
	}


	@Override
	public int compareTo(Department_demo o) {
		if(o.count>10)
		{
			return 1;
		}
		else {
			return 0;
		}
	}
}
