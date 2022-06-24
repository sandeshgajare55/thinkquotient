package com.Class_Basic_Exception_Handling;

import java.util.Scanner;

class BinaryException extends Exception {
	String msg;

	BinaryException(String msg) {
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}
}

public class Binary_demo {
	public static void main(String args[]) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number : ");
			int b_no = sc.nextInt();

			int dm = 0, decimal = 0, b = 1;

			while (b_no > 0) {
				if (b_no % 10 > 1) {
					throw new BinaryException("Invalid Binary");
				} else {
					dm = b_no % 10;
					decimal = decimal + (dm * b);
					b = b * 2;
					b_no = b_no / 10;
				}
			}
			System.out.println("Decimal Number : " + decimal);
		}

		catch (BinaryException e1) {
			System.out.println(e1.getMessage());
		}
	}
}
