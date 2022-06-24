package com.Class_Basic_Hash;
import java.util.*;
public class Department_main {

	public static void main(String[] args) {
		TreeMap<Department_demo,Integer> tm = new TreeMap<>();
		tm.put(new Department_demo(101,"Engineering",50), 1);
		tm.put(new Department_demo(201,"Pharmacy",10), 2);
		tm.put(new Department_demo(301,"Physiotheraphy",9), 3);
		tm.put(new Department_demo(401,"Nursing",20), 4);
		
		
		System.out.println(tm);

	}

}
