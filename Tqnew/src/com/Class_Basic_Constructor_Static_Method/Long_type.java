package com.Class_Basic_Constructor_Static_Method;

public class Long_type {

	public void Method(int a,int b)
	{
		System.out.println(" "+(a));
		System.out.println(" "+(b));
	}
	public static void main(String[] args) {
		Long_type L = new Long_type();
		L.Method((int)88888888888888L, (int)999999999999L);
	}

}
