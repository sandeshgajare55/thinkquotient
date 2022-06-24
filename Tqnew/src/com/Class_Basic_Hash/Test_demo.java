package com.Class_Basic_Hash;
import java.util.*;
public class Test_demo {

	public static void main(String[] args) {
    HashMap <Integer,String> map = new HashMap<>();
    map.put(1, "Rohit");
    map.put(2, "Virat");
    map.put(3, "Rishab");
    map.put(4, "Rahul");
    map.put(5, "Kiran");
    
    System.out.println(map);
    
    for(Map.Entry<Integer, String> map_ent : map.entrySet())
    {
    	if(map_ent.getValue().equals("Virat"))
		{
			System.out.println(map_ent.getValue());
		}
    }
    
	}

}
