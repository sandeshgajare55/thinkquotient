package com.Class_Basic_Inhertitance;

public class Emp2_with_constructor {
	int e_id;
	String e_name;
	Dept_55 Q;

	Emp2_with_constructor(int e_id, String e_name, Dept_55 Q) {
		this.e_id = e_id;
		this.e_name = e_name;
		this.Q = Q;
	}

	public static void main(String ar[]) {
		Emp2_with_constructor emp = new Emp2_with_constructor(21, "Sunny",
				new Dept_55(501, "Desgining", new Address("Pune")));

		System.out.println(emp);
	}

	public String toString() {
		return "Emp2_with_constructor [e_id=" + e_id + ", e_name=" + e_name + ", Dept ID=" + Q.d_id + ", Dept ID="
				+ Q.d_name + ", Address=" + Q.T.city + "]";
	}
}
