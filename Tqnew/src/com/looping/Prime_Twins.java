package com.looping;

import java.util.Scanner;

public class Prime_Twins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Number : ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd Number : ");
		int b = sc.nextInt();
		int diff = 0;
		int udiff = 0;

		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				System.out.println(a + "Not a Prime");
				break;
			} else
				System.out.println("Yes,its a Prime " + a);
			break;
		}

		for (int j = 2; j <= b / 2; j++) {
			if (b % j == 0) {
				System.out.println(b + "Not a Prime ");
				break;
			} else
				System.out.println("Yes,its a Prime " + b);
			break;
		}

		diff = a - b;
		udiff = b - a;
		// System.out.println(diff);
		if (diff == 2 || udiff == 2) {
			System.out.println("Difference is " + diff + " and numbers are Twin Prime ");
		} else
			System.out.println("Difference is " + diff + " and numbers are not Twin Prime...");

	}

}
