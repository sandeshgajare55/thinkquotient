package com.Class_Basic_Inhertitance;

public class Emp {

	int id;
	double sal;
	Person_1 P;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public Person_1 getP() {
		return P;
	}

	public void setP(Person_1 p) {
		P = p;
	}

	public static void main(String ar[]) {
		Emp Emp = new Emp();
		Emp.setId(25);
		Emp.setSal(50000);
		Emp.setP(new Person_1());
		Emp.getP().setName("Sunny");

		System.out.println("Emp Name : " + Emp.getP().getName());
		System.out.println("Emp ID : " + Emp.getId());
		System.out.println("Emp ID : " + Emp.getSal());

	}

}
