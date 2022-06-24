package com.Class_Basic_Final_Abstract_Interface;

class Sub_Final {

	final int A = 10;
	final int B;
	final int C;
	final static int D;

	Sub_Final(int C) { // Constructor
		this.C = 15;
	}

	{   //instance block
		B = 50;
	}
	static {  //static block
		D = 30;
	}

	final void Abc(int A) {  //function passed as parameter but reintialized
		System.out.println(A);
	}

	public static void main(String ar[]) {
		Sub_Final s = new Sub_Final(40);
		s.Abc(20);
	}
}