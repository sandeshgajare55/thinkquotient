package com.tqbasic;

import java.util.ArrayList;
import java.util.Scanner;

public class t_demo {
	public static void main(String args[]) {
		ArrayList<Integer> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		while (sc.hasNextInt()) {
			al.add(sc.nextInt());
		}
		int cnt = 0;
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) % 2 == 0) {
				cnt++;
			}
		}
		System.out.println("Count of Even No is : " + cnt);
	}
}
