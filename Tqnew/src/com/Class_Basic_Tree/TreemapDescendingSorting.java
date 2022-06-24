package com.Class_Basic_Tree;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreemapDescendingSorting {

	public static void main(String[] args) {
		TreeMap<Employee,Integer> tm=new TreeMap(new Employee());
		TreeMap<Employee,Integer> tm1=new TreeMap(new Employee1());
		Employee e1=new Employee(1,"pooja");
		Employee e2=new Employee(12,"ram");
		Employee e3=new Employee(23,"ajay");
		Employee e4=new Employee(33,"suraj");
		
		 tm.put(e1, 1);
		 tm.put(e2, 2);
		 tm.put(e3, 3);
		 tm.put(e4, 4);
		 
	Set<Entry<Employee,Integer>> set=	 tm.entrySet();
	
	for(Map.Entry<Employee , Integer> map:set)
	{
		System.out.println(map.getKey()+" "+map.getValue());
		
		tm1.put(map.getKey(), map.getValue());
	}
	
	
	
	
	System.out.println("-----------------------");
	
Set<Entry<Employee,Integer>> set1=	 tm1.entrySet();
	
	for(Map.Entry<Employee , Integer> map1:set1)
	{
		System.out.println(map1.getKey()+" "+map1.getValue());
	}
	
	
		 
		
		
		

	}

}
