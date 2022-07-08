package com.Class_Basic_Jdbc_new_assignment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//Create HashMap with patient id as key and patient Name as value and display it.
public class Hash_map_demo {
	Connection con;
	Statement st;
	ResultSet rs;
	Scanner sc;
	HashMap<Integer, ArrayList<String>> hm1;

	public Hash_map_demo() throws ClassNotFoundException, SQLException {
		con = DBConnection.getConnection();
	}

	public void hash_demo() throws SQLException {
		st = con.createStatement();
		hm1 = new HashMap<Integer, ArrayList<String>>();
		sc = new Scanner(System.in);
		String s = "select * from patient ";
		rs = st.executeQuery(s);
		System.out.println("Result");
		int id = 0;
		String name;
		while (rs.next()) {
			id = rs.getInt(7);

			if (hm1.containsKey(id)) {
				ArrayList<String> patient = hm1.get(id);
				name = rs.getString(2);
				patient.add(name);
				hm1.put(id, patient);
			} else {
				ArrayList<String> patient = new ArrayList<>();
				name = rs.getString(2);
				patient.add(name);
				hm1.put(id, patient);
			}
		}
		System.out.println(hm1);
	}

	public static void main(String args[]) throws SQLException, ClassNotFoundException {
		Hash_map_demo h = new Hash_map_demo();
		h.hash_demo();
	}

}
