package com.Class_Basic_Jdbc_new;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class update {
	public static void main(String a[]) throws ClassNotFoundException, SQLException
	{
		Connection con= DBConnection.getConnection();
		  Statement st= con.createStatement();
		  PreparedStatement pst;	
		  String q="update departments set location_id=? where department_id=?";
          pst=con.prepareStatement(q);
		  pst.setInt(1, 100);
		  pst.setInt(2, 17);
		 //String s="update departments set location_id=3500 where department_id=17"
		  System.out.println(pst);
		  int i= pst.executeUpdate();
			 System.out.println(i+"   row Updated");
		  
	}

}
