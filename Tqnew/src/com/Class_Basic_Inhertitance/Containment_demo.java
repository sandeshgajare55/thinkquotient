package com.Class_Basic_Inhertitance;

public class Containment_demo {

	int sno, pin;
	String soc, city;

	public void getAdd(int sno, int pin, String soc, String city) {
		this.sno = sno;
		this.pin = pin;
		this.soc = soc;
		this.city = city;
	}

	void show() {
		System.out.println(sno + " " + pin + " " + soc + " " + city);
	}

}
