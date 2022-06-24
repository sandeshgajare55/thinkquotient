package com.tqbasic;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks of 5 Subjects : ");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		int s4=sc.nextInt();
		int s5=sc.nextInt();
		
		int total=s1+s2+s3+s4+s5;
		int per=(total*100)/500;
		
		System.out.println(" Total Marks : "+total);
		System.out.println("The Percentage  : "+per+"%");
		

	}

}
