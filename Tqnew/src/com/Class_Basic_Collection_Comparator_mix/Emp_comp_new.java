package com.Class_Basic_Collection_Comparator_mix;

import java.util.Comparator;
public class Emp_comp_new implements Comparator<Emp_test>{
	@Override
	public int compare(Emp_test o1, Emp_test o2) {
		 if(o1.name.equals(o2.name))
		 {
			 return o1.id-o2.id;
		 }
		 else
		 {
			 return o1.name.compareTo(o2.name);
		 }
	}
	

}
