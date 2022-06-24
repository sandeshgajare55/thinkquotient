package com.Class_Basic_Hash;
import java.util.*;
public class Divis_demo {

	public static void main(String[] args) {

		HashMap <Integer,String> hm = new HashMap<>();
		hm.put(1,"One");
		hm.put(2,"Two");
		hm.put(3,"Three");
		hm.put(4,"Four");
		hm.put(5,"Five");
		hm.put(6,"Six");
		hm.put(7,"Seven");
		hm.put(8,"Eight");
		hm.put(9,"Nine");
		hm.put(10,"Ten");
		
		System.out.println(hm);
		
		Iterator <Integer> it = hm.keySet().iterator();
		
		while(it.hasNext())
		{
			Integer m=it.next();
			if(m.intValue()%3==0)
			{
				it.remove();
			}
		}
		System.out.println(hm);
	}

}
