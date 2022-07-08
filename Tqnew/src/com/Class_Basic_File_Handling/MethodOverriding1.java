package com.Class_Basic_File_Handling;

class Mobile1 {
	Mobile1 show_backCamera()// overriden
	{
		System.out.println("back camera");
		return new Mobile1();
	}
}

class Samsung1 extends Mobile1 {
	@Override
	Samsung1 show_backCamera()// override
	{
		System.out.println("back camera with flash of samsung");
		return this;
	}
}

class Vivo extends Mobile1 {
	@Override
	Vivo show_backCamera()// override
	{
		System.out.println("back camera with flash of vivo");
		return this;
	}
}

public class MethodOverriding1 {

	public static void main(String[] args) {

//stpe1
		/*
		 * Mobile1 m=new Mobile1(); m.show_backCamera(); Samsung1 s=new Samsung1();
		 * s.show_backCamera(); m=new Samsung1();//upcasting generalization
		 * m.show_backCamera(); Mobile1 m1=new Mobile1(); m1=new Samsung1(); Samsung1
		 * s1=(Samsung1) m1;//downcasting
		 */

		Mobile1 r;// refernce of superclass
		r = new Samsung1();// depending on type of object being created that method is called at runtime.
		r.show_backCamera();
		r = new Vivo();
		r.show_backCamera();

		Samsung1 s = new Samsung1();
		System.out.println(s.show_backCamera());

	}

}
