package com.Class_Basic_File_Handling;

abstract class printer
{
	abstract void print();
	
}

abstract class printer1
{
	abstract void print();
	
}

public class Anonymous {

	public static void main(String[] args) {
		
		printer p=new printer()
				{
			@Override
				public void print() {
				System.out.println("Interface1 method");
			}};p.print();
			
			printer1 p1=new printer1()
			{
		@Override
			public void print() {
			System.out.println("Interface2 method");
		}};p1.print();

	}

}
