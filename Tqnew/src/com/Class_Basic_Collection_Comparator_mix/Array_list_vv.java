package com.Class_Basic_Collection_Comparator_mix;

import java.util.*;
public class Array_list_vv {

	public static void main(String[] args) {
		
		String S[]= {"C","C++","Java","Python","JS"};
		System.out.println("--------------Program 1---------------"); 
		System.out.println("Array : "+Arrays.toString(S));
	    ArrayList N = new ArrayList<>();
	    N.add("C");
	    N.add("C++");
	    N.add("Java");
	    N.add("Python");
	    N.add("JavaScript");
	    List l= new ArrayList<>(Arrays.asList(S));
	    System.out.println("List : "+l);
	    System.out.println("--------------Program 2---------------");
	    System.out.println("ArrayList: " +N);
	    String[] A = new String[N.size()];

	    N.toArray(A);
	    System.out.print("Array: ");
	    for(String i:A) {
	      System.out.print(i+", ");
	    }
	      
	      
	      
	      
	      
	      
	  }
	}

