package com.Class_Basic_FH_new;

public class Basic_demo {
	private int pri=10;
	public int pub=50;
	static int st=100;
	static final int fst=150;
	
	static class static_demo{
		static int y=99;
		int j=89;
		void show_st()
		{
			System.out.println(" "+st+" "+fst);
		}
		
	}
	
	class non_static_demo
	{
		//static int x=90;
		int x=55;
		{
			final  int y=90;
		}
		void show_st()
		{
			System.out.println(pri+" "+pub+" "+st+" "+fst);
		}
		
	}
	
	public static void main(String args[])
	{
		Basic_demo b = new Basic_demo();
		//b.static_demo.show_st();
		//b.show_st();
		//static_demo.Basic_demo n = new static_demo();
		//non_static_demo.Basic_demo bn = new Basic_demo().non_static_demo();
	}

}
