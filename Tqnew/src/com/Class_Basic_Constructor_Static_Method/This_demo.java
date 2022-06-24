package com.Class_Basic_Constructor_Static_Method;

public class This_demo {

	int a, p, q,s,w,e;

	This_demo(int a) {
		this(40,50,60);
		this.a = a;
		this.display();// invoke method
	}

	This_demo(int s,int w,int e)
	{
		this.s=s;
	this.w=w;
	this.e=e;
		System.out.println("Second Constructor : "+(q+w+e));
	}
	public void sum(int x, int y) {
		this.p = x;// return current obj variable
		this.q = y;
		System.out.println("Addition : " + (x + y));
	}

	public void display() {
		System.out.println("Value of A : " + a);
	}

	TQ show()
	{
		return new TQ();	
	}
	
	This_demo van(This_demo n)
	{
		return new This_demo(50);
		//return this;
	}
	public static void main(String[] args) {
		This_demo T = new This_demo(10);
		This_demo  r = new This_demo(20);
		T.show();
		//T.van(r);
		System.out.println(""+T.van(r));
		System.out.println(""+T.show());
	}

}

class TQ
{

}