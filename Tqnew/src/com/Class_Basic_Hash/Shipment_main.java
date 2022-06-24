package com.Class_Basic_Hash;
import java.util.*;
public class Shipment_main {
	public static void main(String ar[])
	{
		ArrayList<Shipment_demo> al = new ArrayList<>();
		al.add(new Shipment_demo(11,"Sandesh G",new Address_demo("Pipeline Road","Nagar","Maharashtra"),new My_Date(12,9,2022)));
		al.add(new Shipment_demo(12,"Sarvesh G",new Address_demo("Gulmohar Road","Nagar","Maharashtra"),new My_Date(1,8,2022)));
		al.add(new Shipment_demo(13,"Mangesh G",new Address_demo("Savedi Road","Nagar","Maharashtra"),new My_Date(12,10,2022)));
		al.add(new Shipment_demo(14,"Sainesh J",new Address_demo("Burudgaon Road","Nagar","Maharashtra"),new My_Date(1,5,2022)));
	
		
		System.out.println(al);
		System.out.println();
		
		Collections.sort(al,new Ship_comp());
		System.out.println(al);
	}
	

}
