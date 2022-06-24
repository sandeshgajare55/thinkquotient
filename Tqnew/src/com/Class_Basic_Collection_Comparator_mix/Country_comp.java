package com.Class_Basic_Collection_Comparator_mix;

import java.util.Comparator;
public class Country_comp implements Comparator<Emp_test> {

	@Override
	public int compare(Emp_test o1, Emp_test o2) {
			if(o1.demo.country.equals(o2.demo.country))
				{
					return 1;
				}
				else
					return -1;
		
	}

}
