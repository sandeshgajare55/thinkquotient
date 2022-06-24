package com.Class_Basic_Inhertitance;

public class Emp_123 {
	int e_id;
	String e_name;
	Dept_55 D;

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public Dept_55 getD() {
		return D;
	}

	public void setD(Dept_55 d) {
		D = d;
	}

	public String toString() {
		return "Emp_123 [e_id=" + e_id + ", e_name=" + e_name + ", Dept ID=" + D.d_id + ", Dept Name=" + D.d_name
				+ ", City=" + D.A.city + "]";
	}

	public static void main(String ar[]) {
		Emp_123 emp = new Emp_123();
		emp.setE_id(542);
		emp.setE_name("Sandesh");
		emp.setD(new Dept_55());
		emp.getD().setD_id(121);
		emp.getD().setD_name("Development");
		emp.getD().setA(new Address());
		emp.getD().getA().setCity("Ahmednagar,Maharashtra");

		System.out.println(emp);
	}
}
