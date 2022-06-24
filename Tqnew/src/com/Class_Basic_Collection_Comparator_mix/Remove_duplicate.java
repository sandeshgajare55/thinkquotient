package com.Class_Basic_Collection_Comparator_mix;

import java.util.*;
public class Remove_duplicate {

	public static void main(String[] args) {

		ArrayList<String> A = new ArrayList<>();
		A.add("Sun");
		A.add("Mon");
		A.add("Sat");
		A.add("Sun");
		A.add("Sun");
		A.add("Sat");
		A.add("Sun");
		A.add("Sat");
		A.add("Mon");
		
		System.out.println("ArrayList : "+A);
		
			for(int i=0;i<A.size();i++)
			{
				for (int j=0;j<A.size();j++)
				{
					if(A.get(i)==A.get(j))
					{
						A.remove(j);
					}
				}
			}
			System.out.println("Array List Without Duplicate Elements : "+A);
	}

}
