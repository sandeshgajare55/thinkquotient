package com.Class_Basic;

import java.util.Scanner;

public class Sub_Calculate_demo {

	public static void main(String[] args) {
		Calculate_demo C = new Calculate_demo();
		System.out.println("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		C.Factor(n);
		System.out.println("The Sum of Factors is : " + C.sum);
	}

}
