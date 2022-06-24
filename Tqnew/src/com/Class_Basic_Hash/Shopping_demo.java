package com.Class_Basic_Hash;

public class Shopping_demo {
	
	int id,price,qty;
	String i_name;
	Shopping_demo(int i,String n,int p,int q)
	{
		id=i;
		i_name=n;
		price=p;
		qty=q;
	}
	
	public String toString()
	{
		return id+" "+i_name+" "+price+"rs"+" "+qty;
	}

}
