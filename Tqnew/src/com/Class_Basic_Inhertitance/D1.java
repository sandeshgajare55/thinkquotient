package com.Class_Basic_Inhertitance;

public class D1 {

	public static void main(String ar[]) {
		Number[] n = new Number[5];
		Number n1 = new Integer(20);
//String s = new Character('c');
//System.out.println(s);
		n[0] = new Integer(10);
		n[1] = new Float(3.14);
		n[2] = new Double(50.20);

		System.out.println(n1);
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		System.out.println(n[3]);
		System.out.println(n[4]);
	}

}
