package com.Class_Basic_Tree;
import java.util.Comparator;

public class Employee1 implements Comparator<Employee>{
	int id;
	String name;
	
	
	public Employee1() {
		
	}


	public Employee1(int id, String name) {
	
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return id +" " + name;
	}


	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.id>o2.id)
			return 1;
		else if(o1.id<o2.id)
			return -1;
		else
			return 0;
	}

}
