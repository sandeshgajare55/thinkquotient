package com.Class_Basic_Constructor_Static_Method;

public class Static_demo2 {

	int x;
	
	Static_demo2(){}
	static void Abc(int x)
	{
		Static_demo2 s = new Static_demo2();
		s.x=x;
		s.show();
	}
	
	void show() {	
	System.out.println(x);
	}
	public static void main(String[] args) {
		Static_demo2 a = new Static_demo2();
		Abc(20);
		
	}

}
