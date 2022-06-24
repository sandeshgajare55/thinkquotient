package com.Class_Basic;

public class Calculate_demo {
	int sum = 0;

	public int Factor(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

}
