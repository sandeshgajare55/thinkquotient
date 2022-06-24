package com.Class_Basic_Stack;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Itemss implements Comparable<Itemss>{
	int Itemss_id;
	String Itemss_anme;
	
	

	@Override
	public String toString() {
		return "Itemss [Itemss_id=" + Itemss_id + ", Itemss_anme=" + Itemss_anme + "]";
	}



	public Itemss(int Itemss_id, String Itemss_anme) {
		super();
		this.Itemss_id = Itemss_id;
		this.Itemss_anme = Itemss_anme;
	}



	public static void main(String[] args) {
		Itemss i1=new Itemss(1,"Mobile");
		Itemss i2=new Itemss(2,"HeadPhones");
		Itemss i3=new Itemss(3,"Charger");
		Itemss i4=new Itemss(4,"Speaker");
		Itemss i5=new Itemss(5,"Battery");
		
		
		
		Stack<Itemss> st=new Stack();
		st.add(i1);
		st.add(i2);
		st.add(i3);
		st.add(i4);
		st.push(i5);
		System.out.println(st.peek());
		
		System.out.println(st);
		Iterator<Itemss> it=st.iterator();
		
		while(it.hasNext())
		{
			Itemss i=st.pop();
			System.out.println(i.Itemss_id+" "+i.Itemss_anme);
		}
		System.out.println(st);
		
		
		
		

	}



	



	@Override
	public int compareTo(Itemss o) {
		if(Itemss_id<o.Itemss_id)
			return 1;
		else if(Itemss_id>o.Itemss_id)
			return -1;
		else
			return 0;
	}

}
