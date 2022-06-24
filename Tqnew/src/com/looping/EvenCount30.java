package com.looping;

import java.util.Scanner;

public class EvenCount30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		System.out.println("Odd Between 1 to 30 are : ");
		while (n > 0 && n < 30) {
			if (n % 2 != 0) {
				System.out.println(n);
			}
			n++;
		}
	}

}
