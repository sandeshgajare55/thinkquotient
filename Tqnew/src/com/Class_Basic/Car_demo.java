package com.Class_Basic;

public class Car_demo {
	int C_id;
	String C_name, C_color;
	/*
	 * public Car_demo(int C_id,String C_name,String C_color) { this.C_id=C_id;
	 * this.C_name=C_name; this.C_color=C_color; }
	 */

	public static void main(String[] args) {
		/*
		 * Car_demo c1 = new Car_demo(101,"THAR","Black"); Car_demo c2 = new
		 * Car_demo(102,"Bmw","Red"); Car_demo c3 = new Car_demo(103,"Alto","White");
		 * Car_demo c4 = new Car_demo(104,"Swift","Red"); Car_demo c5 = new
		 * Car_demo(105,"Verna","Blue");
		 */
		Car_demo c1 = new Car_demo();
		Car_demo c2 = new Car_demo();
		Car_demo c3 = new Car_demo();
		Car_demo c4 = new Car_demo();
		Car_demo c5 = new Car_demo();

		c1.C_id = 103;
		c1.C_name = "Bmw";
		c1.C_color = "Black";

		c2.C_id = 106;
		c2.C_name = "Jauguar";
		c2.C_color = "White";

		c3.C_id = 104;
		c3.C_name = "Swift";
		c3.C_color = "Red";

		c4.C_id = 102;
		c4.C_name = "Lamborgini";
		c4.C_color = "Purple";

		c5.C_id = 123;
		c5.C_name = "Tata";
		c5.C_color = "Black";

		System.out.println(c1.C_id + " " + c1.C_name + " " + c1.C_color);
		System.out.println(c2.C_id + " " + c2.C_name + " " + c2.C_color);
		System.out.println(c3.C_id + " " + c3.C_name + " " + c3.C_color);
		System.out.println(c4.C_id + " " + c4.C_name + " " + c4.C_color);
		System.out.println(c5.C_id + " " + c5.C_name + " " + c5.C_color);

	}

}
