package com.Class_Wrapper_class_enum;



enum Enum_demo{
	
	Fullname("Hello my Fullname is Sandesh Gajare "),
	Lastname("Hello my Lastname is Gajare"),
	Firstname("Hello my Firstname is Sandesh");
	private final String name;
	
	private Enum_demo(String name)
	{
		this.name=name;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	
}



public class Enum_Constructor {

	public static void main(String[] args) {
	      Enum_demo n = Enum_demo.Firstname;
	      Enum_demo b = Enum_demo.Lastname;
	      Enum_demo c = Enum_demo.Fullname;
	      System.out.println(n.getName());
	      System.out.println(b.getName());
	      System.out.println(c.getName());
	      System.out.println();
	   }

}
