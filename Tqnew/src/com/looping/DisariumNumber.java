package com.looping;

import java.util.Scanner;
import java.lang.Math;

public class DisariumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check whether it is Disarium or not ");
		int no = sc.nextInt();
		int p = 1, rm = 0, cnt = 0, temp = 0;
		double t = 0;
		int sum = 0;

		temp = no;
		while (no != 0) {
			rm = no % 10;
			cnt++;
			no /= 10;

		}

		System.out.println("cnt" + cnt);

		no = temp;
		while (no != 0) {
			rm = no % 10;
			t = Math.pow(rm, cnt);
			sum += t;
			no /= 10;
			cnt--;
//			  System.out.println("cnt"+cnt);
//			  System.out.println(p);

		}
		System.out.println("The Sum is :" + sum);

		if (sum == temp) {
			System.out.println("No is Disarium");
		} else
			System.out.println("No is not Disarium");
	}

}
