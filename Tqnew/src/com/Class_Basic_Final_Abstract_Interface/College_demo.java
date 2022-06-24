package com.Class_Basic_Final_Abstract_Interface;

public interface College_demo {
	public abstract int collegePin(int p);

	default void collegeName() {
		System.out.println("College Name : Dr.Vithalrao Vikhe Patil College Of Engineering Ahmednagar");
	}

	static void collegeOwner() {
		System.out.println("College Owner : Dr.Sujay Vikhe Patil");
	}

}
