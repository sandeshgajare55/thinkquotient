package com.Class_Basic_Final_Abstract_Interface;

public class Player_finance extends Player {

	public int Salary() {
		return 5000000;
	}

	public String bankName() {
		return "Bank Of America";
	}

	public static void main(String ar[]) {
		Player_finance PF = new Player_finance();
		PF.Display();
		System.out.println("Person Name : " + PF.Name());
		System.out.println("Person Gender : " + PF.Gender());
		System.out.println("Person Profession : " + PF.Profession());
		System.out.println(PF.Name() + "`s" + " Bank : " + PF.bankName());
		System.out.println(PF.Name() + "`s" + " Salary : " + PF.Salary());

	}
}
