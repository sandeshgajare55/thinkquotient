package com.Class_Basic_Hash;

import java.util.ArrayList;
import java.util.*;

public class Shopping_main {

	public static void main(String[] args) {
		
		ArrayList <Shopping_demo> sd= new ArrayList<>();
		
		sd.add(new Shopping_demo(12,"Mily Bikes",10,50));
		sd.add(new Shopping_demo(13,"GoodDay",20,100));
		sd.add(new Shopping_demo(14,"Hide and Seek",30,50));
		sd.add(new Shopping_demo(15,"Oero",10,50));
		sd.add(new Shopping_demo(16,"Bournvita",20,50));
		sd.add(new Shopping_demo(13,"GoodDay",20,110));
		sd.add(new Shopping_demo(15,"Oero",10,70));
		
		
		System.out.println("Item Details : "+sd);
		
		HashMap<String,Integer> map =new HashMap<>();
		
		for(Shopping_demo s: sd)
		{
			if(map.containsKey(s.i_name))
			{
				int x=map.get(s.i_name)+s.qty;
				map.put(s.i_name, x);
			}
			else
			{
				map.put(s.i_name,s.qty);
			}
		}
		
		System.out.println("Map with All Quantity : "+map);
		
	}

}
