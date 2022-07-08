package com.Class_Basic_File_Handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		
		System.out.println("Enter the employee id");
		int id=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the employee name");
		String name=br.readLine();

		System.out.println("Enter the employee salary");
		double sal=Double.parseDouble(br.readLine());
		

		System.out.println("Enter the employee gender");
	char gender=(char) br.read();
	
	
	System.out.println("Employee id is...."+id);
	System.out.println("Employee name is...."+name);
	System.out.println("Employee salary is...."+sal);
	System.out.println("Employee gender...."+gender);
	}

}
