package com.tqbasic;

import java.util.Scanner;

public class Loan_demo {

	double rate1,rate2, principle, loan = 0;

	public void houseLoan(double rate1, double principle) {
		System.out.println("-------------Housing Loan Department-------------");

		loan = principle * (100 + rate1);

		System.out.println("Housing Loan is : " + loan + " Rs");
	}

	public void commercialLoan(double rate1, double rate2, double principle) {
		System.out.println("--------------Commercial Loan Department----------------");

		loan = principle * (rate1 + rate2 + 100);

		System.out.println("Commercial Loan is : " + loan + " Rs");
	}

	public static void main(String ar[]) {
		Loan_demo loandemo = new Loan_demo();

		Scanner sc = new Scanner(System.in);

		System.out.println("Press 1 for Housing Loan and 2 for Commercial Loan : ");
		int c = sc.nextInt();
		switch (c) {
		case 1:
			System.out.println("Enter rate of interest, Principle amount for Housing Loan : ");
			double r = sc.nextDouble();
			double pa = sc.nextDouble();
			loandemo.houseLoan(r, pa);
			break;
		case 2:
			System.out.println("Enter rate of interest 1, rate of interest 2, Principle amount for Commercial Loan : ");
			double r1 = sc.nextDouble();
			double r2 = sc.nextDouble();
			double pac = sc.nextDouble();
			loandemo.commercialLoan(r1, r2, pac);
			break;
		}

	}
}
