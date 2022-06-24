package com.Class_Basic_Inhertitance;

public class Emp_demo {
	int eid;
	Containment_demo d;

	public void getid(int eid, Containment_demo d) {
		this.eid = eid;
		this.d = d;
	}

	public void show() {
		System.out.println("eid : " + eid);
		this.d.show();
	}

	public void setAdd(Containment_demo ad) {
		d = ad;
	}

	public static void main(String[] args) {

	}

}
