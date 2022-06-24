package com.Class_Basic_Exception_Handling;

import java.util.Scanner;

public class Throw_keyword {
	public int factorial(int n) {
		if (n < 0) {
			throw new NumberFormatException();
		} else {
			int fact = 1;
			while (n > 0) {
				fact = fact * n;
				n--;
			}
			return fact;
		}
	}

	public static void main(String args[]) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number : ");
			int n = sc.nextInt();
			Throw_keyword key = new Throw_keyword();
			System.out.println("Factorial : "+key.factorial(n));
		} catch (NumberFormatException e1) {
			System.out.println("Invalid Input");
		}

	}
}
