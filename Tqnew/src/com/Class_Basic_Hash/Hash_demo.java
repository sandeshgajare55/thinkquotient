package com.Class_Basic_Hash;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Hash_demo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		
		hm.put(1,"Sandesh");
		hm.put(2, "Sarvesh");
		hm.put(null, null);
		
		System.out.println("HashMap : "+hm);
		
		LinkedHashMap<Integer,String> lp=new LinkedHashMap<>();
		
		lp.put(01,"Tymal");
		lp.put(null, null);
		lp.put(8,"Boult");
		
		System.out.println("LinkedHashMap : "+lp);

	}

}
