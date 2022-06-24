package com.Class_Basic_Final_Abstract_Interface;

class Ball extends Co {
	int s;

	public void Measurement(int s) {
		speed = s;
		System.out.println("Ball Bowled at " + s + " speed...");
	}
}

class Car extends Co {
	int sp;

	public void Measurement(int sp) {
		speed = sp;
		System.out.println("Car been drive at " + sp + " speed");
	}
}

public class Abstract_demo {
	public static void main(String ar[]) {
		Co A = new Ball();
		A.setSpeed(100);
		System.out.println(A.getSpeed());
		A.Measurement(80);

		Co A1 = new Car();
		A1.Measurement(180);
	}
}