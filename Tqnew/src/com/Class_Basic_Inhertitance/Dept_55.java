package com.Class_Basic_Inhertitance;

public class Dept_55 {

	int d_id;
	String d_name;
	Address A;
	Address T;

	Dept_55() {
	}

	Dept_55(int d_id, String d_name, Address T) {
		this.d_id = d_id;
		this.d_name = d_name;
		this.T = T;
	}

	public Address getA() {
		return A;
	}

	public void setA(Address a) {
		A = a;
	}

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

}
