package com.Class_Basic;

import java.util.Scanner;

public class Calculator_demo {
	int num1, num2;
	int result;
	Scanner sc = new Scanner(System.in);

	public void Addition() {
		System.out.println("Enter the Two Numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		result = num1 + num2;
		System.out.println("The Addition is : " + result);
	}

	public void Subtraction() {
		result = num1 - num2;
		System.out.println("The Subtraction is : " + result);

	}

	public void Multiplication() {
		result = num1 * num2;
		System.out.println("The Multiplication is : " + result);

	}

	public void Division() {
		result = num1 / num2;
		System.out.println("The Division is : " + result);

	}

	public static void main(String args[]) {
		Calculator_demo c = new Calculator_demo();
		c.Addition();
		c.Subtraction();
		c.Multiplication();
		c.Division();
	}

}
