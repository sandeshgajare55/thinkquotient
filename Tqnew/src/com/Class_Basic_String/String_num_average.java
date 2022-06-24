package com.Class_Basic_String;

import java.util.Scanner;

public class String_num_average {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = new String();
		System.out.println("Enter the String : ");
		s = sc.nextLine();
		int sum = 0, avg = 0;
		int cnt = 0;
		String temp = "0";
		s.trim();
		String A[] = s.split(" ");

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				temp += ch;
				cnt++;
			} else {
				sum += Integer.parseInt(temp);
				temp = "0";

			}
		}
		System.out.println(temp);
		sum += Integer.parseInt(temp);
		System.out.println(" Sum of number which are present : " + sum);
		avg = sum / cnt;
//		System.out.println(cnt);
		System.out.println("Average of Number present : " + avg);
	}
}
