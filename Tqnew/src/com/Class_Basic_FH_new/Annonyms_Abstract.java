package com.Class_Basic_FH_new;

abstract class demo_1{
	abstract void show();
}


public class Annonyms_Abstract {
	public static void main(String args[])
	{
		demo_1 d=new demo_1() {
			public void show() {
				System.out.println("Welcome to Annonyms Class using Abstract Class...!!!!!!!!!!!!!!");
			}
		};
		
		d.show();
	}

}
