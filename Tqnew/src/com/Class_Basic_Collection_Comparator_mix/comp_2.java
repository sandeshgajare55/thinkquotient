package com.Class_Basic_Collection_Comparator_mix;

import java.util.Comparator;
public class comp_2 implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
       if(o1.city.equals(o2.city))
       {
    	   return 1;
       }
       else return -1;
		
	}
	

}
