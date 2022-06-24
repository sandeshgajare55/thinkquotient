package com.Class_Basic_Collection_Comparator_mix;
import java.util.*;
public class Traverse_list {
	    public static void main(String[] args)
	    {
	        LinkedList<String> List_1 = new LinkedList<>();
	        List_1.add("Sun");
	        List_1.add("Mon");
	        List_1.add("Tue");
	        List_1.add("Wed");
	        List_1.add("Thr");
	        List_1.add("Fri");
	        List_1.add("Sat");
	        ListIterator<String> list_iterator = List_1.listIterator(List_1.size());
	        System.out.println("-------------- List in Reverse Order -------------");
	        while (list_iterator.hasPrevious())
	        {
	            System.out.println(list_iterator.previous());
	        }
	    }
	}


