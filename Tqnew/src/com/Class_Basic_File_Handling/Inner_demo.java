package com.Class_Basic_File_Handling;
 class A {
	int a = 10;
	static int b = 60;

	static void Disp() {
		System.out.println(b);
	}

	public void show() {
		System.out.println("Show Method");
	}

	static class B {
		static int b = 50;
		public void Disp() {
			System.out.println("From B");
			A.Disp();
			System.out.println("Outter Class");
		}
	}
}



