package com.Class_Basic_Collection_Comparator_mix;

import java.util.Comparator;

public class comp_1 implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
       if(o1.name.equals(o2.name))
       {
		return 1;
	}
       return 0;
	}

	
}
