package com.Class_Basic;

import java.util.Scanner;

public class Function_demo {
	String v_no;
	String v_name;
	String v_owner;
	String v_color;
	Scanner sc = new Scanner(System.in);

	public void Accept() {
		System.out.println("Enter Vehicle Number,Vehicle Name,Vehicle Color");
		v_no = sc.next();
		v_name = sc.next();
		v_color = sc.next();
	}

	public void Display() {
		System.out.println("Vehicle Number : " + v_no);
		System.out.println("Vehicle Name : " + v_name);

	}

	public String Color() {
		return v_color;
	}

	public String Owner(String v_owner) {
		return v_owner;
	}

	public static void main(String[] args) {
		Function_demo F = new Function_demo();
		F.Accept();
		F.Display();
		System.out.println("Vehicle Owner : " + F.Owner("Sandesh Gajare"));
		System.out.println("Vehicle Color : " + F.Color());
	}

}
