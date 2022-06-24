package com.Class_Wrapper_class_enum;

public class sample_program {
	public static void main(String ar[])
	{
		Integer i = new Integer(2);
		int a= i.intValue();
		String s ="555";
		int radix = 16;
		
		Integer o = new Integer(20);
		Integer p = new Integer("30");
	
		Float g= new Float(33.5f);
		Float t= new Float("23.56");
		
		
	  
		System.out.println(o);
		System.out.println(p);
		System.out.println(g);
		System.out.println(t);
		System.out.println(""+Long.parseLong(s,radix));
	}

}
