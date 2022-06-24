package com.Class_Basic_Hash;
import java.util.*;
public class Order_main {

	public static void main(String[] args) {
		ArrayList <Order_demo> O =new ArrayList<>();
		
		O.add(new Order_demo(01,"Pen",5,"Done","Pune"));
		O.add(new Order_demo(02,"Folder",50,"Pending","Nagar"));
		O.add(new Order_demo(03,"CraftPaper",10,"Pending","Nagpur"));
		O.add(new Order_demo(04,"Book",100,"Pending","Amravati"));
		O.add(new Order_demo(05,"Pencil",3,"Done","Mumbai"));
		
		System.out.println("Array List : "+O);
		
		HashMap<String, Integer> M = new HashMap<String,Integer>();
		
		for (Order_demo a : O)
		{
			if(a.status.equals("Pending"))
			{
			if(M.containsKey(a.city))
			{
				int x=M.get(a.city)+1;
				M.put(a.city, x);
			}
			else
			{
				M.put(a.city,1);
			}
			}
		}
		
		System.out.println("Map for Pending Status : "+M);
		
	}

}
