package com.Class_Basic_File_Handling;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Linked_demo {
	public static void main(String args[]) {
		Map<Integer, String> m = new LinkedHashMap<>();
		m.put(1, "Sandesh");
		m.put(2, "Sarvesh");
		m.put(3, "Saigon");

		System.out.println(m);

		String s = m.get(2);
		System.out.println(s);

		System.out.println("Traversing using keyset : ");
		Set<Integer> st = m.keySet();
		Iterator<Integer> i = st.iterator();
		while (i.hasNext()) {
			Integer key = i.next();
			System.out.println(key + " = " + m.get(key));
		}
			System.out.println("Traversing using values : ");
			Collection <String> list =m.values();
			Iterator<String> sq=list.iterator();
			while(sq.hasNext())
			{
				System.out.println(sq.next());
			}
			
			System.out.println("Traverse using Entry Set : ");
			Set<Entry<Integer,String>> es = m.entrySet() ;
			Iterator<Entry<Integer,String>> it = es.iterator();
			while(it.hasNext())
			{
				
			}
			
			
			
		}

	}


