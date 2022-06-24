package com.Class_Basic_Stack;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Stack;

class Item implements Comparator<Item>{
	int id;
	String name;
	public Item(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compare(Item o1, Item o2) {
		if(o1.id<o2.id)
			return 1;
		else if(o1.id>o2.id)
			return -1;
		else return 0;
	}
	
}
public class ItemStack {

	public static void main(String[] args) {
		Item i1=new Item(101, "SmartPhone");
		Item i2=new Item(102, "SmartTV");
		Item i3=new Item(103, "Refrigerator");
		Item i4=new Item(104, "Air-Conditioner");
		
		Stack<Item>st=new Stack<>();
		st.add(i1);
		st.add(i2);
		st.add(i3);
		st.add(i4);
		Iterator<Item>it=st.iterator();
		while(it.hasNext()) {
			Item i=it.next();
			System.out.println("Item Id :"+i.id+"\tItem Name :"+i.name);
			it.remove();
		}
		System.out.println(st);
	}

}
