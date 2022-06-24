package com.Class_Basic_Collection_Comparator_mix;

import java.util.ArrayList;
import java.util.Collections;

public class Stu_Main {
	public static void main(String[] args) {
		ArrayList<Stu_demo> a=new ArrayList<>();
		a.add(new Stu_demo(1,20,"Rohan"));
		a.add(new Stu_demo(3,21,"Tohan"));
		a.add(new Stu_demo(2,22,"Prahan"));
		a.add(new Stu_demo(4,23,"OOhan"));
		a.add(new Stu_demo(5,25,"Vihan"));

		System.out.println(a);
		Collections.sort(a,new Stu_comp());
		
		System.out.println(a);
	}

}
