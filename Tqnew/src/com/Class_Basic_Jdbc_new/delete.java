package com.Class_Basic_Jdbc_new;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class delete {
	public static void main(String arg[]) throws ClassNotFoundException, SQLException
	{
		Connection con= DBConnection.getConnection();
		  Statement st= con.createStatement();
		  
		  String s="delete from departments where department_id=16";
		  int i= st.executeUpdate(s);
		  System.out.println(i+"   row deleted");
	}

}
