package com.Class_Basic_Tree;
import java.util.*;
public class Demo_examp {
	public static void main(String[] args) {

		ArrayList<Integer> al= new ArrayList<>();
		ArrayList<Integer> al2= new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(5);
		al.add(4);
		al.add(1);
		al.add(2);
		al.add(3);
		
		for(Integer i: al)
		{
			if(!al2.contains(i))
			{
				al2.add(i);
			}
		}
		
		Iterator <Integer> itr = al2.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			
	}

}
