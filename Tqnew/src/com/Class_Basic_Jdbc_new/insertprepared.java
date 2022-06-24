package com.Class_Basic_Jdbc_new;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class insertprepared {
	public static void main(String ar[]) throws ClassNotFoundException, SQLException
	{
		Connection con= DBConnection.getConnection();
		 PreparedStatement pst;	
		 String q="insert into departments values(?,?,?,?)";
		 pst=con.prepareStatement(q);
		  pst.setInt(1, 101);
		  pst.setString(2,"Engineering");
		  pst.setInt(3,1000);
		  pst.setInt(4,2000);
		  
		  int i= pst.executeUpdate();
		  System.out.println(i+"   row Updated");
		  System.out.println("Record Inserted....");
	}

}
