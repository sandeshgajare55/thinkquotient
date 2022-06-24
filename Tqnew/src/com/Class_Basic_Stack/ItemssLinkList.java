package com.Class_Basic_Stack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ItemssLinkList {

	public static void main(String[] args) {
		Itemss i1=new Itemss(1,"Mobile");
		Itemss i2=new Itemss(2,"HeadPhones");
		Itemss i3=new Itemss(3,"Charger");
		Itemss i4=new Itemss(4,"Speaker");
		
		Queue<Itemss> qu=new LinkedList<>();
		
	
		
		
		
		Queue<Itemss> qu1=new LinkedList<>();
		Stack<Itemss> st=new Stack<>();
	/*	qu.add(i1);
		qu.add(i2);
		qu.add(i3);
		qu.add(i4);*/
		
	/*	qu1.add(i1);
		qu1.add(i2);
		qu1.add(i3);
		qu1.add(i4);*/
		
		
		ArrayList<Itemss> al=new ArrayList();
		al.add(i1);
		al.add(i2);
		al.add(i3);
		al.add(i4);
		
		
		
//		Collections.sort(al);
		Collections.reverseOrder();
		
		//System.out.println(al);
		
		qu1.addAll(al);
		
		//System.out.println(qu1);
		
		
		
		
		
		
		
		
	
		
		
/*Iterator<Itemss> it=qu.iterator();
		
		while(it.hasNext())
		{
			
		Itemss i=qu.removeLast();
		
		st.add(i);
		//System.out.println(i.Itemss_id+" "+i.Itemss_anme);
		
		

	}
		System.out.println(st);*/
		
		
Iterator<Itemss> it=qu1.iterator();
		
		while(it.hasNext())
		{
			
		Itemss i=qu1.remove();
		
		
		System.out.println(i.Itemss_id+" "+i.Itemss_anme);
		st.add(i);
		
		

	}
		System.out.println(st);

}
}
