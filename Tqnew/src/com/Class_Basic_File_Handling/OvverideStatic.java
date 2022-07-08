package com.Class_Basic_File_Handling;

class Parent11 {
	static void dsipaly() {
		System.out.println("parent1 method");
	}
}

class child11 extends Parent11 {

	static void dsipaly() {
		System.out.println("child method");
	}

}

public class OvverideStatic {

	public static void main(String[] args) {

		Parent11 p;
		p = new child11();
		p.dsipaly();

	}

}
