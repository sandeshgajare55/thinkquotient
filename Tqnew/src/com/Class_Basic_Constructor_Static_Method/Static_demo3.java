package com.Class_Basic_Constructor_Static_Method;

public class Static_demo3 {

	static int x;
	static void M1(int x)
	{
		//Static_demo3 s= new Static_demo3();
		//s.x=x;
		//s.show();
		Static_demo3.x=x;
	}
	void show()
	{
		System.out.println(x);
	}
	public static void main(String[] args) {
		Static_demo3 S = new Static_demo3();
		Static_demo3.M1(10);
		S.show();
	}

}
