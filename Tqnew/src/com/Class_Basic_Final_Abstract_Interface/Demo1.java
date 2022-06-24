package com.Class_Basic_Final_Abstract_Interface;

public class Demo1 extends Const_demo {

	Demo1() {
		super(100);
		System.out.println("sub class");
	}

	/*
	 * public void Eat() { System.out.println("Person Eats Food"); }
	 * 
	 * public void Play() { super.Play();
	 * System.out.println("Person Plays Football "); }
	 */

	public static void main(String ar[]) {
		Demo1 demo = new Demo1();
		// demo.Eat();
		// demo.Play();
	}

}
