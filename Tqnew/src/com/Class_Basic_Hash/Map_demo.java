package com.Class_Basic_Hash;

import java.util.*;
public class Map_demo {
	
	public static void main(String ar[])
	{
		HashMap <Integer,String> map = new HashMap<>();
		
		map.put(1, "A");
		map.put(1, "B");
		map.put(1, "C");
		map.put(1, "D");
		map.put(1, "E");
		map.put(1, "F");
		
		
		System.out.println(map);
		
		HashMap <Integer,String> map2 = new HashMap<>();
		
		long i = 0;
		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
		    Map.Entry<Integer, String> pair = it.next();
		   
		}

		System.out.println(map2);
	}

}
