package com.Class_Basic_Tree;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreemapSortingvalues {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap();
		
		LinkedHashMap<Integer,String> tm2=new LinkedHashMap();
		
		tm.put(101,"pooja");
		tm.put(102, "aakash");
		tm.put(103, "chintan");
		tm.put(104, "suraj");
		
		
	Collection<String> col=tm.values();
	
	Iterator<String> it=col.iterator();
	ArrayList<String> al=new ArrayList();
	while(it.hasNext())
	{
		String s=it.next();
		al.add(s);
	}
		
		
Collections.sort(al);

System.out.println(al);


Set<Entry<Integer,String>> set=tm.entrySet();

Iterator<Entry<Integer,String>> it1=set.iterator();

for(String st:al)
{

	for(Map.Entry<Integer, String> map:set)
	{
	if(map.getValue().equals(st))
			{
	Integer i2=map.getKey();
	String s2=map.getValue();
	
	
		tm2.put(i2, s2);
	
}
}
}

System.out.println(tm2);


	}

}
