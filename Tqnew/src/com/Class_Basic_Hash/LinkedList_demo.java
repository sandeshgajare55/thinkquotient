package com.Class_Basic_Hash;

import java.util.*;
public class LinkedList_demo {
	public static void main(String args[])
	{
		LinkedList <Integer> l1= new LinkedList<>();
		LinkedList <Integer> l2= new LinkedList<>();
		LinkedList <Integer> l3= new LinkedList<>();
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		
		l2.add(11);
		l2.add(22);
		l2.add(33);
		l2.add(44);

		
		System.out.println("List 1 : "+l1);
		System.out.println("List 2 : "+l2);
		
		l3.addAll(l1);
		for(int i=0;i<l2.size();i++)
		{
			l3.add((i*2)+1,l2.get(i));
		}
		
		System.out.println("List 3 : "+l3);

	}
}
