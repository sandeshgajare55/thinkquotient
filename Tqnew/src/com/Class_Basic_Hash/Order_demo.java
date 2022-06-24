package com.Class_Basic_Hash;

public class Order_demo {
	int id,price;
	String i_name,status,city;
	
	Order_demo(int i,String n,int p,String s,String c)
	{
		id=i;
		i_name=n;
		price=p;
		status=s;
		city=c;
	}
	
	public String toString()
	{
		return id+" "+i_name+" "+price+" "+status+" "+city;
	}
	
}
