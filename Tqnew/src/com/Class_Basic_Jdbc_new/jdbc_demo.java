package com.Class_Basic_Jdbc_new;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_demo {
	public static void main(String a[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver") ;
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdbsandy", "root", "Shrisai12@") ;
		System.out.println("Connection Established....");
		
		Statement st =conn.createStatement();
		String s="Select * from Departments";
		ResultSet rs = st.executeQuery(s);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
		conn.close();
	}
	

}
