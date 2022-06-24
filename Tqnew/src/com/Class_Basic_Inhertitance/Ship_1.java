package com.Class_Basic_Inhertitance;

public class Ship_1 {
	int S_id;
	Order Om;
	MyDate Md;

	Ship_1(int S_id, Order Om, MyDate Md) {
		this.S_id = S_id;
		this.Om = Om;
		this.Md = Md;
	}

	public String toString() {
		return "Shipment [Shipment ID=" + S_id + ", Order ID=" + Om.O_id + ", Customer Name=" + Om.C_name
				+ ", Order Date=" + Md.date + "-" + Md.month + "-" + Md.year + " City=" + Om.O_city + "]";
	}

	public static void main(String args[]) {
		Ship_1 Ship = new Ship_1(12345, new Order(324, "Sunny", "Pune"), new MyDate(12, 12, 2021));
		System.out.println(Ship);

	}
}
