package com.Class_Basic_Hash;

import java.util.ArrayList;
import java.util.HashMap;
public class Order_delivered {

	public static void main(String[] args) {
		ArrayList <Order_demo> O2 =new ArrayList<>();
		
		O2.add(new Order_demo(1,"Pen",5,"Done","Pune"));
		O2.add(new Order_demo(2,"Folder",50,"Pending","Nagar"));
		O2.add(new Order_demo(3,"CraftPaper",10,"Done","Nagpur"));
		O2.add(new Order_demo(4,"Book",100,"Done","Amravati"));
		O2.add(new Order_demo(5,"Pencil",3,"Done","Mumbai"));
		O2.add(new Order_demo(6,"Pendrive",56,"Done","Pune"));
		O2.add(new Order_demo(7,"CD",67,"Done","Nagar"));
		O2.add(new Order_demo(8,"DVD",100,"Done","Nagpur"));
		O2.add(new Order_demo(9,"Eraser",10,"Pending","Amravati"));
		O2.add(new Order_demo(10,"Rough Book",30,"Done","Mumbai"));
		
		System.out.println("Array List : "+O2);
		
		HashMap<String, Integer> h_demo = new HashMap<String,Integer>();
		
		for (Order_demo i : O2)
		{
			if(i.status.equals("Done"))
			{
			if(h_demo.containsKey(i.city))
			{
				int b=h_demo.get(i.city)+1;
				h_demo.put(i.city, b);
			}
			else
			{
				h_demo.put(i.city,1);
			}
			}
		}
		
		System.out.println("Map for Done Status : "+h_demo);
		
	}
	}


