package com.Class_Basic_Collection_Comparator_mix;

import java.util.ArrayList;
import java.util.Collections;

class Emp implements Comparable<Emp> {

	int id,salary;
	String name,dept,city;
	
	Emp(int i,int s,String n,String d,String c)
		{
			id=i;
			salary=s;
			name=n;
			dept=d;
			city=c;
		}
			
			public String toString()
			{
				return id+" "+salary+" "+name+" "+dept+" "+city+" "; 
			}
		
			@Override
			public int compareTo(Emp o) {
				if(this.id>o.id)
					return 1;
				else if (this.id<o.id)
					return -1;	
				else
				return 0;
			}	
			
}
	class comparable_demo{
	public static void main(String[] args) {
		
		ArrayList<Integer> Al= new ArrayList<>();
		ArrayList<Emp> c=new ArrayList<>();
		
		
		c.add(new Emp(104,40000,"Sandesh","Engineering","Nagar"));
		c.add(new Emp(103,80000,"Sarvesh","Engineering","Nagar"));
		c.add(new Emp(102,70000,"Sainesh","Pharmacy","Pune"));
		c.add(new Emp(105,20000,"Siddesh","Engineering","Nagar"));
		c.add(new Emp(101,50000,"Mangesh","Engineering","Nashik"));
		
		//Collections.sort(c,new comp_1()); // Comparator 1
		//System.out.println(c);
		
		Collections.sort(c,new comp_2());
		System.out.println(c);
		
		//Collections.sort(c);
		
		//System.out.println(c);
		
		
		
//		Al.add(105);
//		Al.add(102);
//		Al.add(101);
//		Al.add(104);
//		
//		System.out.println(Al);
//		
		

	}

	
}
