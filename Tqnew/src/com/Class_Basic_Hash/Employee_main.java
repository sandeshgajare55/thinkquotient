package com.Class_Basic_Hash;
import java.util.*;
public class Employee_main {
	
	public static void main(String args[])
	{
		HashMap<Employee_demo,Integer> map = new HashMap<>();
		
		map.put(new Employee_demo(1,"Sandesh G","Engg","9089765432"), 50000);
		map.put(new Employee_demo(2,"Sarvesh G","Engg","8989765421"), 56000);
		map.put(new Employee_demo(3,"Sainesh G","Pharm","9889765432"), 80000);
		map.put(new Employee_demo(4,"Swadesh G","Pharm","7889765423"), 100000);
		map.put(new Employee_demo(1,"Sandesh G","Engg","9089765432"), 50000);
	
		System.out.println(map);
	
		
	}

}
