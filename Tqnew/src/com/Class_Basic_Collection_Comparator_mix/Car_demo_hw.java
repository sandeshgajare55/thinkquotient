package com.Class_Basic_Collection_Comparator_mix;

import java.util.ArrayList;
public class Car_demo_hw
{
	public static void main(String args[])
	{
		ArrayList <demo_hw> H= new ArrayList<>();
		
		H.add(new demo_hw(111,"Safari","TATA",600000,2005));
		H.add(new demo_hw(112,"Verna","HYUNDAI",1000000,2013));
		H.add(new demo_hw(113,"Nexon","TATA",800000,2016));
		H.add(new demo_hw(114,"Creta","HYUNDAI",1200000,2017));
		H.add(new demo_hw(115,"Tiago","TATA",700000,2012));
		
		
		System.out.println(H);
		System.out.println("Car launched in 2005 and Price greater than 5 lakhs :");
		for(demo_hw w:H)
		{
			if(w.year==2005 && w.price>500000)
			{
				System.out.println(w);
			}
		}
	}
	
}