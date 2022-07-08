package com.Class_Basic_Jdbc_new_assignment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class Doc_pat {
	Connection con;
	CallableStatement cb;
	Scanner sc;

	public Doc_pat() throws ClassNotFoundException, SQLException {
		con = DBConnection.getConnection();
	}

	public void p_Details() throws SQLException {
		String s = "{call doc_pat(?)}";
		cb = con.prepareCall(s);
		sc = new Scanner(System.in);
		System.out.println("Enter the Doctor ID : ");
		int id = sc.nextInt();
		cb.setInt(1, id);
		ResultSet rs = cb.executeQuery();
			while (rs.next()) {
				System.out.println( " " + rs.getInt(1)+" "+rs.getString(2)+ " " + rs.getInt(3));
			}
	}

	public static void main(String arg[]) throws ClassNotFoundException, SQLException {
		Doc_pat d = new Doc_pat();
		d.p_Details();
	}

}
