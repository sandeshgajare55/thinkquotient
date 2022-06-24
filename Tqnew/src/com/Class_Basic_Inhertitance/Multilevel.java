package com.Class_Basic_Inhertitance;

public class Multilevel {
	float f_sal = 0, f_salary = 30000;

	public static void main(String ar[]) {
	}
}

class Hra extends Multilevel {
	float hra = 3000;

	public static void main(String ar[]) {
	}

}

class DailyAllowance extends Hra {
	float da = 2000;

	public static void main(String ar[]) {
	}

}

class TotalSal extends DailyAllowance {
	float bonus = 2000;

	public static void main(String args[]) {
		TotalSal obj = new TotalSal();
		obj.f_sal = obj.f_salary + obj.hra + obj.da + obj.bonus;
		System.out.println("Total Salary is:" + obj.f_sal);
	}
}
