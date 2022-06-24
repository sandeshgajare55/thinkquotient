package com.Class_Basic_Hash;

import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
public class Number_new {
	
	public static void main(String ar[])
	{
		LinkedList<Integer> ls = new LinkedList<>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(1);
		ls.add(5);
		
		System.out.println("Linked List : "+ls);

		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		for (Integer i:ls)
		{						
			String digit=" ";
			
			switch(i)
			{
			case 1:digit="One";
			break;
			case 2:digit="Two";
			break;
			case 3:digit="Three";
			break;
			case 4:digit="Four";
			break;
			case 5:digit="Five";
			break;
			}
			if(map.containsKey(digit))
			{
				int x=map.get(digit)+1;
				map.put(digit, x);
			}
			else
			{
				map.put(digit, 1);
			}
		}
		
		System.out.println(map);

	}
}
