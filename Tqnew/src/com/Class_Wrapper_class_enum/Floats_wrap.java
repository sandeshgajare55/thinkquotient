package com.Class_Wrapper_class_enum;

public class Floats_wrap {
	public static void main(String ar[])
	{
		Integer a=new Integer(3);    
		Float x = new Float(56f);
		Double y = new Double(76.2);
		Long l = new Long(5435345);
		byte b=10;
		Byte B =new Byte(b);
		
		System.out.println(a.floatValue());
		System.out.println(x.floatValue());
		System.out.println(y.floatValue());
		System.out.println(l.floatValue());
		System.out.println(B.floatValue());
	}

}
