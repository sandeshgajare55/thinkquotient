	package com.Class_Basic_Final_Abstract_Interface;

final class Final_demo { // prevent inheritance

	final double A = 3.14;// create constant variable

	final void Method1()// prevent method from overidding
	{
		System.out.println("Final Method : ");
	}

	public static void main(String ar[]) {
		Final_demo finals = new Final_demo();
		finals.Method1();
		System.out.println(finals.A);
	}

}
