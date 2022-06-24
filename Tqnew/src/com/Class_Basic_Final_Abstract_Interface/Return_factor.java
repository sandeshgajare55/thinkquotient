package com.Class_Basic_Final_Abstract_Interface;

public class Return_factor implements Sum {
	public int sumFact(int a) {
		int sum = 0;
		for (int i = 1; i <=a; i++) {
			if (a % i == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of Factors : " + sum);
		return 0;
	}

	public static void main(String ar[]) {
		int a = 20;
		Return_factor factor = new Return_factor();
		System.out.println("Number  is : " + a);
		factor.sumFact(a);
	}
}
