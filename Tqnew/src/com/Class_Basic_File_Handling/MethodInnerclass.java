package com.Class_Basic_File_Handling;

class Calculate
{
	
	int a=10,b=20;
	void display()
	{
		class Calculate_Sum
		{
			int c=30;
			void sum()
			{
				System.out.println(a+b+c);
			}
		}
		Calculate_Sum c=new Calculate_Sum();
		c.sum();
	}
}
public class MethodInnerclass {

	public static void main(String[] args) {
		Calculate c=new Calculate();
		c.display();

	}

}
