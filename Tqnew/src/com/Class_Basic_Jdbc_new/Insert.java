package com.Class_Basic_Jdbc_new;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	   Connection con= DBConnection.getConnection();
	  Statement st= con.createStatement();
	
	  String s="Insert into departments values(17,'Engineering',137,3000)";
	  int i= st.executeUpdate(s);
	  System.out.println(i+"   row inserted");
	
	}



}
