package com.Class_Basic_Hash;

import java.util.*;
public class Pune_demo {

	public static void main(String[] args) {

		ArrayList <String> al = new ArrayList<>();
		
		al.add("Pune");
		al.add("Katraj");
		al.add("Pune");
		al.add("Mumbai");
		al.add("Pune");
		al.add("Mumbai");
		
		System.out.println(al);
		
		HashMap <String,Integer> map= new HashMap<>();
		
		for(String s:al)
		{
			if(map.containsKey(s))
			{
				int a=map.get(s)+1;
				map.put(s, a);
			}
			else
			{
				map.put(s, 1);
			}
		}
		
		System.out.println(map);
	}

}
