package com.Class_Basic_Collection_Comparator_mix;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Student>A= new ArrayList<>();
		ArrayList <Integer> M=new ArrayList<>();
		M.add(80);
		M.add(70);
		M.add(86);
		A.add(new Student(12,"Sandesh","Bny",M));
		M.clear();
		M.add(85);
		M.add(72);
		M.add(84);
		A.add(new Student(13,"Dhruvesh","Tvs",M));
		M.clear();
		M.add(82);
		M.add(73);
		M.add(81);
		A.add(new Student(14,"Sarvesh","Hero",M));
		M.clear();
		M.add(84);
		M.add(77);
		M.add(82);
		A.add(new Student(15,"Mangesh","Bajaj",M));
		M.clear();
		M.add(79);
		M.add(68);
		M.add(94);
		
		
		ListIterator<Integer> list = M.listIterator();
		
		while (list.hasNext()) {
            System.out.println(list.next());
        }
		
	}

}
