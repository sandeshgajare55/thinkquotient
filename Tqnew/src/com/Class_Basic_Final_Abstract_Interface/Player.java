package com.Class_Basic_Final_Abstract_Interface;

abstract public class Player extends Person {
	abstract public int Salary();

	abstract public String bankName();

	public String Name() {
		return "Ronaldo";
	}

	public String Gender() {
		return "Male";
	}

	public String Profession() {
		return " Football Player";
	}

	public void Display() {
		super.Display();
	}

}
