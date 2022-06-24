package com.Class_Basic_Collection_Comparator_mix;

public class demo_hw {
	int id, price,year;
	String name,B_name;
	
	demo_hw(int i,String n,String bn,int p,int y)
	{
		id=i;
		name=n;
		B_name=bn;
		price=p;
		year=y;
	}
	
	public String toString()
	{
		return id+" "+name+" "+B_name+" "+price+" "+year;
	}

}
