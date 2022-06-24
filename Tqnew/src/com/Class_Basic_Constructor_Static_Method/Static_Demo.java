package com.Class_Basic_Constructor_Static_Method;

public class Static_Demo {
	 static int a=10;
	int b=20;

	public static void Demo()
	{
		System.out.println("------------Static Method-------------");
		System.out.println("Static Variable a : "+a);
		Static_Demo s1=new Static_Demo();
		System.out.println("Non Static Variable b: "+s1.b);
		
	}
	
	public void Demo2()
	{
		System.out.println("---------Non Static Method------------");
		System.out.println("Non Static Variable : "+b);
		System.out.println("Static Variable : "+a);
	}
	
	public static void main(String[] args) {
		
		Static_Demo Static = new Static_Demo();
		Demo();
		Static.Demo2();
			//System.out.println(Static.b);
	}

}
