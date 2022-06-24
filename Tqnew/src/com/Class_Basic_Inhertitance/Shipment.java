package com.Class_Basic_Inhertitance;

public class Shipment {
	int S_id;
	Order O;
	MyDate D;

	public int getS_id() {
		return S_id;
	}

	public void setS_id(int s_id) {
		S_id = s_id;
	}

	public Order getO() {
		return O;
	}

	public void setO(Order o) {
		O = o;
	}

	public MyDate getD() {
		return D;
	}

	public void setD(MyDate d) {
		D = d;
	}

	@Override
	public String toString() {
		return "Shipment [Shipment ID=" + S_id + ", Order ID=" + O.O_id + ", Customer Name=" + O.C_name
				+ ", Order Date=" + D.date + "-" + D.month + "-" + D.year + " City=" + O.O_city + "]";
	}

	public static void main(String ar[]) {
		Shipment shipment = new Shipment();
		shipment.setS_id(1002451);
		shipment.setO(new Order());
		shipment.getO().setO_id(521);
		shipment.getO().setO_city("Ahmednagar");
		shipment.getO().setC_name("Sandesh");
		shipment.setD(new MyDate());
		shipment.getD().setDate(2);
		;
		shipment.getD().setMonth(06);
		shipment.getD().setYear(2021);

		System.out.println(shipment);
	}

}
