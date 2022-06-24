package com.Class_Basic_Inhertitance;

public class Dept {
	Student_demo S;
	int id;
	String name;

	Dept() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void show() {
		System.out.println(id);
		System.out.println(id);
	}

	public void setId(Student_demo Sw) {
		S = Sw;
	}

	public static void main(String[] args) {

	}

}
