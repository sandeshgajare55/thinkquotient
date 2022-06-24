package com.Class_Basic_Stack;
public class Item1 {
	int item_id;
	String item_anme;
	
	

	@Override
	public String toString() {
		return "Item [item_id=" + item_id + ", item_anme=" + item_anme + "]";
	}



	public Item1(int item_id, String item_anme) {
		super();
		this.item_id = item_id;
		this.item_anme = item_anme;
	}

}
