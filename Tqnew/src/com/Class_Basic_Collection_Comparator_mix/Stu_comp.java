package com.Class_Basic_Collection_Comparator_mix;

import java.util.Comparator;
public class Stu_comp implements Comparator<Stu_demo> {

	@Override
	public int compare(Stu_demo o1, Stu_demo o2) {
		if(o1.age>o2.age)
		{
			return 1;
		}
		else if(o1.age<o2.age)
		{
			return -1;
		}
		else
		{
				if(o1.name.equals(o2.name))
				{
					return o1.roll_no-o2.roll_no;
				}
				else
					return o1.name.compareTo(o2.name);
		}
		}

}