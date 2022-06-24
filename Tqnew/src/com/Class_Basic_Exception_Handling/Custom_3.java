package com.Class_Basic_Exception_Handling;

import java.util.Scanner;

class AlphaException extends Exception {
	String str;

	AlphaException(String str) {
		this.str = str;
	}

	public String getMessage() {
		return str;
	}
}

class LengthException extends Exception {
	String msg;

	LengthException(String msg) {
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}
}

public class Custom_3 {

	public static void main(String args[]) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Numerical String : ");
			String s = sc.next();
			double avg = 0;
			int sum = 0;
			s.trim();
			char a[] = s.toCharArray();
			int size = a.length;
			if (size > 10 || size < 10) {
				throw new LengthException("Length Exception");
			}
			for (int i = 0; i < a.length; i++) {
				if (Character.isDigit(a[i])) {

					sum = sum + Character.getNumericValue(a[i]);
				} else {
					throw new AlphaException("Alphabet Exception");
				}
			}
			System.out.println("size : " + size);
			System.out.println("sum : " + sum);
			avg = sum / size;
			System.out.println("average : " + avg);

		} catch (AlphaException e1) {
			System.out.println(e1.getMessage());
		}

		catch (LengthException e2) {
			System.out.println(e2.getMessage());
		}
	}
}
