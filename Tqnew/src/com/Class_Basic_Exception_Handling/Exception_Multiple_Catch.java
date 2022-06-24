package com.Class_Basic_Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Multiple_Catch {
	public static void main(String args[]) {
		try {
			Scanner sc = new Scanner(System.in);
			int fact = 1;
			int x = 1;
			System.out.println("Enter Number : ");
			int n = sc.nextInt();
			while (x <= n) {
				fact = fact * x;
				x++;
			}
			System.out.println("Factorial : " + fact);
			int a = 8;
			int b = 0;
			int c = a / b;
		} catch (ArithmeticException e1) {
			System.out.println("Divide by zero");
		} catch (InputMismatchException e3) {
			System.out.println("Invalid Input");
		}
	}
}
