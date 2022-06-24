package com.Class_Basic_Inhertitance;

public class Order {

	int O_id;
	String C_name;
	String O_city;

	Order() {
	}

	public Order(int o_id, String c_name, String o_city) {
		O_id = o_id;
		C_name = c_name;
		O_city = o_city;
	}

	public int getO_id() {
		return O_id;
	}

	public void setO_id(int o_id) {
		O_id = o_id;
	}

	public String getC_name() {
		return C_name;
	}

	public void setC_name(String c_name) {
		C_name = c_name;
	}

	public String getO_city() {
		return O_city;
	}

	public void setO_city(String o_city) {
		O_city = o_city;
	}

}
