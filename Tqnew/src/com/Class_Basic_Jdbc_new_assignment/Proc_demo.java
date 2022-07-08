package com.Class_Basic_Jdbc_new_assignment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class Proc_demo {
	Connection con;
	Statement st;
	CallableStatement cb;
	ResultSet rs;

	Proc_demo() throws ClassNotFoundException, SQLException {
		con = DBConnection.getConnection();
	}

	public void using_Procedure() throws SQLException {
		String s = "{call p_age_name(?,?,?)}";
		CallableStatement cb = con.prepareCall(s);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Patient ID : ");
		int id = sc.nextInt();
		cb.setInt(1, id);
		cb.registerOutParameter(2, Types.VARCHAR);
		cb.registerOutParameter(3, Types.INTEGER);
		System.out.println(cb.execute());
		boolean b=cb.execute();
		if(b==false)
		{
			System.out.println(cb.getString(2) + " " + cb.getInt(3));
		}
	}

	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Proc_demo p = new Proc_demo();
		p.using_Procedure();

	}

}
