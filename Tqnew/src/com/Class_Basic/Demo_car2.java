package com.Class_Basic;

import java.util.Scanner;

public class Demo_car2 {

	public static void main(String[] args) {
		Car_demo2 Car = new Car_demo2();
		Car.setValueC_id(207);
		Car.setC_name("Lamborgini");
		Car.setC_color("Black");
		Car.setC_speed(100);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter speed");
		int s = sc.nextInt();
		if (s > 80) {
			System.out.println("Ple enter again");
			s = sc.nextInt();
			Car.setC_speed(s);
		}

		System.out.println("Car ID : " + Car.getValueC_id());
		System.out.println("Car Name: " + Car.getC_name());
		System.out.println("Car Color : " + Car.getC_color());
		System.out.println("Car Speed : " + Car.getC_speed());
	}

}
