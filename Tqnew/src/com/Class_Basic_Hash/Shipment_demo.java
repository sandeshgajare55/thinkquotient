package com.Class_Basic_Hash;

public class Shipment_demo {
	int s_id;
	String c_name;
	Address_demo add;
	My_Date date;
	
	Shipment_demo(int i,String n,Address_demo a,My_Date d)
	{
		s_id=i;
		c_name=n;
		add=a;
		date=d;
	}
	
	public String toString()
	{
		return s_id+" "+c_name+" "+add.address+" "+add.city+" "+add.state;
	}

}
