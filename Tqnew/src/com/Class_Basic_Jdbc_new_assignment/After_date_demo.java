package com.Class_Basic_Jdbc_new_assignment;

//Fetch Patient names admitted after 5th May 2020 and age above 50 and store it in ArrayList
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class After_date_demo {
	Connection con;
	Statement st;
	ResultSet rs;
	Scanner sc;
	ArrayList<String> AL;
	HashMap<Integer, String> hm;

	After_date_demo() throws ClassNotFoundException, SQLException {
		con = DBConnection.getConnection();
	}

	public void show_Patient_After_Date() throws SQLException {
		AL = new ArrayList<String>();
		hm = new HashMap<Integer, String>();
		st = con.createStatement();
		sc = new Scanner(System.in);
		String s = "select * from patient where a_date>'2019-05-04' and age>30";
		rs = st.executeQuery(s);
		int i = 0;
		int id = 0;
		String n;
		System.out.println("Result");
		while (rs.next()) {
			id = rs.getInt(1);
			n = rs.getString(2);
			AL.add(n);
			hm.put(id, n);

		}
		System.out.println("Array List : ");
		System.out.println(AL);
		System.out.println(hm);
	}

	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		After_date_demo A = new After_date_demo();
		A.show_Patient_After_Date();
	}
}
