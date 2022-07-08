package com.Class_Basic_FH_new;

public class Inner_local_Method {
	public void show_Demo()
	{
		class B{
			public void show()
			{
				System.out.println("Inner Class Method..!!!!");
			}
		}
		B o= new B();
		o.show();
	}

	public static void main(String args[])
	{
		Inner_local_Method I = new Inner_local_Method();
		I.show_Demo();
		//I.show();
	}
}
