package com.Class_Basic;

import java.util.Scanner;

public class Car_demo2 {

	private int C_id, C_speed;
	private String C_name, C_color;

	void setValueC_id(int C_id) {
		this.C_id = C_id;
	}

	int getValueC_id() {
		return C_id;
	}

	public String getC_name() {
		return C_name;
	}

	public void setC_name(String c_name) {
		C_name = c_name;
	}

	public String getC_color() {
		return C_color;
	}

	public void setC_color(String c_color) {
		C_color = c_color;
	}

	public int getC_speed() {
		return C_speed;
	}

	public void setC_speed(int C_speed) {
		this.C_speed = C_speed;
		/*
		 * if(C_speed>80) { System.out.println("Enter the correct Speed"); Scanner
		 * sc=new Scanner(System.in); C_speed = sc.nextInt(); setC_speed(C_speed);
		 * //sc.close(); } else { this.C_speed = C_speed; }
		 */
	}

}
