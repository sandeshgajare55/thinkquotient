package com.Class_Basic_Constructor_Static_Method;

public class Overload_main {

	public static void main(Integer args) {
		System.out.println(" Integer argument");
	}

	public static void main(char args) {
		System.out.println(" Char argument");
	}

	public static void main(String[] args) {
		Overload_main.main(5);
		Overload_main.main('c');
		System.out.println(" main() method invoked");
	}
}
