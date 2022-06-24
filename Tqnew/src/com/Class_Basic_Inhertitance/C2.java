package com.Class_Basic_Inhertitance;

public class C2 extends Covarient {

	C2 Display() {
		System.out.println("Child Class");
		return this;
	}

	public static void main(String ar[]) {
		Covarient c = new C2();
		c.Display();
	}
}
