package com.Class_Basic_Jdbc_new_assignment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Set_demo {
	Connection con;
	Statement st;
	ResultSet rs;
	Set<Integer> set;

	Set_demo() throws ClassNotFoundException, SQLException {
		con = DBConnection.getConnection();
	}

	public void patient() throws SQLException, NullPointerException {
		List al;
		Set f_result;
		st = con.createStatement();
		set = new HashSet<Integer>();
		String s = "select * from patient";
		rs = st.executeQuery(s);
		System.out.println("Result Of Patient in Desc Order.....");
		int id = 0;
		while (rs.next()) {
			id = rs.getInt(1);
			set.add(id);
		}
		al = new ArrayList<Integer>(set);
		Collections.sort(al, Collections.reverseOrder());
		f_result = new LinkedHashSet(al);
		System.out.println("Descending Order of Patient ID in SET : ");
		System.out.println(f_result);

	}

	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Set_demo se = new Set_demo();
		se.patient();
	}

}
