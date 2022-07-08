package com.Class_Basic_File_Handling;

class Person {
	String acting(String home) {
		System.out.println("He is a father");
		return home;
	}

	void acting(int id, String office) {
		System.out.println("He is a Employee of.." + office);
	}

	void acting(String fri, String name) {
		System.out.println(name + ".. is a friend of" + fri);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Person p = new Person();
		p.acting("Xyz");
		p.acting(1, "Tcs");
		p.acting("ram", "suraj");
		// p.acting(12,34,"ram");

	}

}
