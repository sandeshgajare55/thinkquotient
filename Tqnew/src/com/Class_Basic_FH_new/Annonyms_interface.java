package com.Class_Basic_FH_new;

interface demo{
	void show();
}
public class Annonyms_interface {

	public static void main(String args[])
	{
		demo A = new demo() {
			public void show()
			{
				System.out.println("Hello Annonyms Inner Class.....!!!!!!");
			}
		};
		
		A.show();
	}
}
