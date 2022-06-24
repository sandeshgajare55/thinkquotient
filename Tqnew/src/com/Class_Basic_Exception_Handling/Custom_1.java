package com.Class_Basic_Exception_Handling;

import java.util.Scanner;

class NegativeException extends Exception {
	String msg;

	NegativeException(String msg) {
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}
}

public class Custom_1 {
	public static void main(String args[]) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number : ");
			int n = sc.nextInt();
			int s = 0;
			if (n < 0) {
				throw new NegativeException("Negative Number");
			} else {
				s = n * n;
				System.out.println("Positive Number is " + n + " and its square : " + s);
			}
		} catch (NegativeException e1) {
			System.out.println(e1.getMessage());
		}
	}

}
