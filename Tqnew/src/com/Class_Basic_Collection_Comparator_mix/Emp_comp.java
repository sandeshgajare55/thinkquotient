package com.Class_Basic_Collection_Comparator_mix;

import java.util.Comparator;

public class Emp_comp implements Comparator<Employee_demo>{

	@Override
	public int compare(Employee_demo o1, Employee_demo o2) {
		if(o1.d.year>o2.d.year)
		{
			return 1;
		}
		else if(o1.d.year<o2.d.year)
		{
			return -1;
		}
		else {
			if(o1.d.month>o2.d.month)
			{
				return 1;
			}
			else if(o1.d.month<o2.d.month)
			{
				return -1;
			}
			else
			{
				if(o1.d.day>o2.d.day)
				{
					return 1;	
				}
				else if(o1.d.day<o2.d.day)
				{
					return -1;
				}
				else
					return 0;
			}
				
		}
		   
	}

}
