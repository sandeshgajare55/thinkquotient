package com.Class_Basic_Collection_Comparator_mix;
import java.util.*;
public class Emp_demo{	
	public static void main(String s[])
	{
		ArrayList <Emp_test>a= new ArrayList<>();
		
		a.add(new Emp_test(11,"Sandesh",50000,"Engineering",new Another_demo("MH","India")));
		a.add(new Emp_test(14,"Swadesh",40000,"Pharmacy",new Another_demo("UP","India")));
		a.add(new Emp_test(12,"Sarvesh",30000,"Logistics",new Another_demo("LA","USA")));
		a.add(new Emp_test(13,"Mangesh",20000,"Engineering",new Another_demo("TX","USA")));
		a.add(new Emp_test(10,"Mangesh",20000,"Engineering",new Another_demo("Paris","UK")));
		
		System.out.println("Original : "+a);
		Collections.sort(a,new Emp_comp_new());
		System.out.println("Name Wise : "+a);
		Collections.sort(a, new Country_comp());
		System.out.println("Country Wise : "+a);
	}		
}


