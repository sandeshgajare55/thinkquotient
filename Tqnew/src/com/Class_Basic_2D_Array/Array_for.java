package com.Class_Basic_2D_Array;

public class Array_for {

	public static void main(String as[]) {

		int A[][] = { { 1, 2, 3, }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum = 0;
		for (int[] arr : A) {
		sum=0;
			for (int i : arr) {
				sum=sum+i;
				}
			}
			System.out.println(sum);
		}

	}

