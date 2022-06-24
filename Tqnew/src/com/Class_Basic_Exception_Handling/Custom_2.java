package com.Class_Basic_Exception_Handling;

import java.util.Scanner;

class NegativeException1 extends Exception {
	String msg;

	NegativeException1(String msg) {
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}
}

public class Custom_2 {
	static int power(int base, int index) {
		int pow = 1;
		for (int i = 1; i <= index; i++)
			pow *= base;
		return pow;
	}

	public static void main(String args[]) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Base and Index : ");
			int base = sc.nextInt();
			int index = sc.nextInt();

			if (index < 0) {
				throw new NegativeException1("Negative Index");
			} else {
				System.out.println(Custom_2.power(base, index));
			}
		} catch (NegativeException1 e2) {
			System.out.println(e2.getMessage());
		}
	}
}
