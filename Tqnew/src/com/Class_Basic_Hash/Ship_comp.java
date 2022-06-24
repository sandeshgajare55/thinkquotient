package com.Class_Basic_Hash;
import java.util.*;
public class Ship_comp implements Comparator<Shipment_demo> {

	@Override
	public int compare(Shipment_demo o1, Shipment_demo o2) {
		if(o1.add.city.equals(o2.add.city))
		{
			if(o1.date.year==o2.date.year)
				{
					if(o1.date.month==o2.date.month)
					{
						return o1.date.day-o2.date.day;	
					}
					else
					{
						return o1.date.month-o2.date.month;
					}
				}
			else
			{
				return o1.date.year=o2.date.year;
			}
		}
		else
		{
		 return 1;	
		}
	}

	
}
